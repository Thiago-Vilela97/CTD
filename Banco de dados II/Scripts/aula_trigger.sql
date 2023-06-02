
ALTER TABLE musimundos.artistas
add column userCreator varchar(50),
add column dateCreation datetime;

DELIMITER $$
create trigger musimundos.trg_insere_registro_artista
before insert on musimundos.artistas
for each row
BEGIN
	set new.userCreator = (select current_user());
	set new.dateCreation = now();
END;
$$

insert into artistas (id, nome) values (276, 'Teste teste');

select * from artistas;