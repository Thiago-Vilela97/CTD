-- Em um banco de dados qualquer, vamos gerar uma SP que recebe diferentes números como parâmetros em um 
-- varchar separados por “;”.  Use LOOP para percorrê-los. 
-- Importante: no final sempre coloque um “;”. Um exemplo, '10;66;138;37;-72;0,5;'. 
-- A SP retornará 2 parâmetros: a soma total entre eles e sua média.
-- Só precisamos somar e calcular a média dos números que são positivos. 
-- Valide o que foi dito acima com um CASE. Assumimos que pelo menos 1 número é sempre recebido. 

DELIMITER $$
CREATE procedure musimundos.numeros (in numeros varchar(100), out soma double, out media double)
begin
	declare quantidade int default 0;
    set soma = 0;
    
    numeros_loop: loop
		set quantidade = quantidade + 1;
		case when (cast(left(numeros, locate(';', numeros)-1) as double) > 0) then
			set soma = soma + cast(left(numeros, locate(';', numeros)-1) as double);
		else set quantidade = quantidade - 1;
        end case;
        
        set numeros = right(numeros, char_length(numeros) - locate (';', numeros));
        
        if(locate(';', numeros) = 0) then
			leave numeros_loop;
		end if;
        
    end loop;
	set media = soma / quantidade;
end;
$$

DELIMITER $$
	call musimundos.numeros  ('10;66;138;37;-72;-5;10;', @soma, @media);
select @soma, @media;
$$