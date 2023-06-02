-- Precisamos criar um procedimento armazenado que insira um cliente, SP_Cliente_Insert, 
-- que receba os dados do cliente e os insira na tabela clientes, caso não haja cliente com o mesmo número de RG.

DELIMITER $$
create procedure dhemprestimos.SP_Cliente_Insert(in p_rg int, in p_sobrenome varchar(255), in p_nome varchar(255), in p_data_nasc date, in p_idScoring int)
begin
	if(p_rg  not in (select rg from clientes)) then
			insert into clientes(rg, sobrenome, nome, data_nasc, Scoring_idScoring) values(p_rg, p_sobrenome, p_nome, p_data_nasc, p_idScoring);
		end if;
end;
$$
call dhemprestimos.SP_Cliente_Insert(108, 'teste', 'teste', '1976-01-01', 1);
select * from clientes;

-- Criar uma função fn_ValidaIdade que, dada a data de nascimento da pessoa (AAAAMMDD), a data de início do empréstimo (AAAAMMDD) e a qtd  de parcelas, 
-- verifique se atende à condição de que a pessoa não tenha mais de 80 anos no final do empréstimo.