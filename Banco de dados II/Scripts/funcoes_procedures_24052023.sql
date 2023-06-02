-- Exercicio usando SCHEMA CONTEUDOS - aula do dia 24/05/2023

-- 1.	A empresa NetFilmes deseja que, quando um novo usuário se cadastrar no seu site, uma função calcule sua idade e uma procedure 
-- liste os filmes referentes ao gênero indicado para a idade.
-- Uma dica: Você já criou uma função para calcular a idade. Basta copiá-la e executar no banco conteudos.


DELIMITER $$
create function conteudos.f_obter_idade (birth date) returns tinyint 
deterministic
begin
	declare age tinyint;
    set age = (select timestampdiff(year,birth, curdate()));
    return age;
end;
$$

DELIMITER $$
create procedure usp_mostra_conteudo(p_id int)
begin
	declare dt_nasc date;
    set dt_nasc = (select data_nascimento from usuarios where id = p_id);
    
    select f.titulo as Titulo_Filme, g.nome as Genero, g.idade
    from conteudos.filmes f
    inner join conteudos.filme_genero fg on fg.filme_id = f.filme_id
	inner join conteudos.generos g on fg.genero_id = g.genero_id
    where g.idade <= case when conteudos.f_obter_idade(dt_nasc) between 0 and 9 then 9
						 when conteudos.f_obter_idade(dt_nasc) between 10 and 17 then 17
						 when conteudos.f_obter_idade(dt_nasc) between 18 and 25 then 25
                         when conteudos.f_obter_idade(dt_nasc) between 26 and 40 then 40
                         when conteudos.f_obter_idade(dt_nasc) > 40 then 50
                         else 55
                         end;
end;
$$

call usp_mostra_conteudo(1);


-- 2.	É solicitado, ainda, que seja criada uma procedure que, dado o id de um cliente, seja possível exibir o tipo de plano de assinatura,
-- o número de parcelas, a data de vencimento e o valor de cada parcela.


DELIMITER $$
CREATE FUNCTION fn_diaUtil(data1 date) RETURNS date
 DETERMINISTIC
BEGIN
	DECLARE diaUtil date;
   	 if weekday(data1) < 5 then
			set diaUtil= data1;
	elseif weekday(data1)=5 then 
			# é sabado
			set diaUtil= date_add(data1,INTERVAL 2 DAY);
	else
			#é domingo
			set diaUtil= date_add(data1,INTERVAL 1 DAY);
    	end if ;
RETURN diaUtil;
END $$
DELIMITER ;

#Procedure SP_Gera_Parcela()
DELIMITER $$
CREATE PROCEDURE SP_Gera_Parcela(IN p_id int, pDataInicio date)
BEGIN
declare valorParcela decimal(10,2) default 1;
    	declare vParcela int ;
   	 declare pParcelas int;
    	declare dataParcela date;
    	DECLARE dt_nasc date;
    	declare pPlano varchar(50);
   	 set vParcela = 1;
    	SET dt_nasc = (select data_nascimento from usuarios where id = p_id);
    	SET pParcelas = (SELECT fidelidade  from pacotes WHERE 
f_obter_idade(dt_nasc) between idade_min AND idade_max);
    	SET pPlano = (SELECT tipo  from pacotes WHERE f_obter_idade(dt_nasc) 
between idade_min AND idade_max);
        /* Valor da Parcela */
    	set valorParcela = (SELECT valor from pacotes 
  	  WHERE f_obter_idade(dt_nasc) between idade_min AND idade_max) ;

    /*Criação da Tabela Temporária para as parcelas */
    Drop table if exists tmpParcelas;
    	CREATE TEMPORARY TABLE tmpParcelas (id_usuario int, plano varchar(50), nroParcela int, dataVenc date, valor decimal(10,2));
    	 set dataParcela = pDataInicio;
    	WHILE vParcela <= pParcelas DO
	/*Select vParcela,valorParcela, dataParcela;*/
        	insert into tmpParcelas (id_usuario, plano, nroParcela, dataVenc,valor) values  
       	 (p_id, pPlano, vParcela,fn_diaUtil(dataParcela),valorParcela);
      	 set dataParcela = Date_add(dataParcela,Interval 30 day);
	Set vParcela = vParcela +1 ;
    END WHILE;
	Select 
		id_usuario as 'Usuário',
		plano as 'Plano',
		nroParcela as 'Nro da parcela ',
        DATE_FORMAT(dataVenc,'%d %m %Y') as 'Data da Parcela',
        	valor as 'Valor Parcela'
   	 from tmpParcelas;
    
END $$

DELIMITER ;

call SP_Gera_Parcela(230,'2022-08-25');


-- 3.	Gere uma procedure que insira os dados da tabela temporária na tabela assinaturas. Para isso,  siga o que se pede:
-- a)	crie uma procedure que receberá os dados da tabela temporária e realizará o insert na tabela assinaturas.
-- b)	crie uma procedure com um cursor que receberá os dados de cada linha da tabela temporária e chamará  a procedure anterior para inserir os dados.

DELIMITER $$
CREATE  PROCEDURE sp_assinaturas_inserir(p_id_usuario int, p_plano varchar(30), p_parcela int, p_dataVenc date, p_valor decimal(10,2))
begin
insert into assinaturas (id_usuario, plano, parcelas, dataVenc, valor)
values (p_id_usuario,p_plano, p_parcela, p_dataVenc, p_valor);
end $$
DELIMITER ;

# Procedure sp_assinaturas_cursor
DELIMITER $$
CREATE PROCEDURE sp_assinaturas_cursor()
BEGIN
DECLARE c_id_usuario int default 0;
DECLARE c_plano varchar(30) default null;
DECLARE c_parcela int default 0;
DECLARE c_dataVenc date;
DECLARE c_valor decimal(10,2) default 0;
DECLARE fimLoop int default 0;

DECLARE insert_cursor CURSOR FOR SELECT id_usuario, plano, nroParcela, dataVenc,valor FROM tmpParcelas;
DECLARE CONTINUE HANDLER FOR not found SET fimLoop = 1;
OPEN insert_cursor;
carregaParcelas: LOOP
FETCH insert_cursor INTO c_id_usuario, c_plano, c_parcela, c_dataVenc, c_valor;
IF fimLoop = 1 THEN	
		LEAVE carregaParcelas;
ELSE
		       
		CALL sp_assinaturas_inserir(c_id_usuario, c_plano, c_parcela, c_dataVenc, c_valor);
        
END IF;
END LOOP;
CLOSE insert_cursor;
END $$
DELIMITER ;

call sp_assinaturas_cursor();
