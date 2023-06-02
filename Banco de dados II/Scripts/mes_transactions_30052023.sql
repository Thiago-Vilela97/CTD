/*2 - NÃO HOUVE A NECESSIDADE DE INCLUIR TRANSACTION NESSA FUNÇÃO

DELIMITER $$
CREATE FUNCTION dhemprestimos.fn_ValidaIdade(data_nasc date, data_inicio_emp date, qtdParcelas int) returns boolean
deterministic
begin
    declare datafimParcela date;
    declare anos int;
    set datafimParcela = date_add(data_inicio_emp, interval qtdParcelas MONTH); 
    if (select timestampdiff(YEAR, data_nasc, datafimParcela)) > 80 then
      return true;
    else
      return false;
    end if;
end;
$$

SELECT case when dhemprestimos.fn_ValidaIdade(c.data_nasc, curdate(), 430) then 'MAIS DE 80' ELSE 'NÃO TEM MAIS DE 80' END FINAL_EMPRESTIMO, 
       c.nome 
  from dhemprestimos.clientes c;

select date_add(curdate(), interval 400 MONTH),  timestampdiff(YEAR, curdate(), '2056-09-24')

/*3 - NÃO HOUVE A NECESSIDADE DE INCLUIR TRANSACTION NESSA FUNÇÃO

DELIMITER $$
CREATE FUNCTION dhemprestimos.fn_diaUtil(dataA date) returns date
deterministic
begin
  return case when dayofweek(dataA) between 2 and 6 then dataA 
     else case when dayofweek(dataA) = 1 then date_add(dataA, interval 1 DAY)
     else date_add(dataA, interval 2 DAY) end end; 
end;
$$

select dhemprestimos.fn_diaUtil(curdate()) DIAATUAL, dhemprestimos.fn_diaUtil('2023-05-20') SABADORETORNADIAUTIL, dhemprestimos.fn_diaUtil('2023-05-21') DOMINGORETORNADIAUTIL; 

/*4 - Criar um stored procedure SP_Gera_Parcela que, dado um valor, data de início e número de parcelas, gere os detalhes das parcelas.*/

CREATE TEMPORARY TABLE  parcelas(valor DECIMAL(10,2), data_vencimento DATE);
DROP TABLE parcelas;

DELIMITER $$
CREATE PROCEDURE dhemprestimos.SP_Gera_Parcela(IN valor DECIMAL(10,2), IN data_inicio DATE, IN num_parcelas INT)
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE data_vencimento DATE;
    WHILE i <= num_parcelas DO
        SET data_vencimento = DATE_ADD(data_inicio, INTERVAL (i-1)*30 DAY);
        -- Verificar se a data de vencimento é um dia útil e ajustar se necessário
        
        -- 	TRANSACTION ADICIONADA (30/05/2023)
        start transaction;
        INSERT INTO parcelas(valor, data_vencimento) VALUES (valor, data_vencimento);
        commit;
        
        SET i = i + 1;
    END WHILE;
    SELECT * FROM parcelas;
END 
$$


call dhemprestimos.SP_Gera_Parcela(100000,'20220101',5);
