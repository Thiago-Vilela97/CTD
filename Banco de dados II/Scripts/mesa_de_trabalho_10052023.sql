-- 1. Listar todos os países que contêm a letra A, ordenados alfabeticamente
SELECT NOME FROM PAIS
WHERE UPPER(NOME) LIKE 'A%'
ORDER BY NOME ASC;

SELECT NOME FROM PAIS
WHERE UPPER(NOME) LIKE '%A%'
ORDER BY NOME ASC;

-- 2. Gere uma lista de usuários, com detalhes de todos os seus dados, o avatar que possuem e a qual país pertencem.

SELECT usuario.* , avatar.nome AS Avatar, pais.nome AS Pais
FROM usuario
LEFT JOIN avatar ON usuario.Avatar_idAvatar = avatar.idAvatar
LEFT JOIN pais ON usuario.Pais_idPais = pais.idPais;

-- 3. Faça uma lista com os usuários que possuem playlists, mostrando a quantidade que possuem.

SELECT usuario.nome, COUNT(playlist.usuario_idUsuario) AS Qtd_Playlist
FROM playlist
LEFT JOIN usuario ON playlist.usuario_idUsuario = usuario.idUsuario
GROUP BY usuario_idUsuario;

-- 4. Mostrar todos os canais criados entre 01/04/2021 e 01/06/2021.

SELECT * FROM CANAL
WHERE dataCriacao BETWEEN '2021-04-01' AND '2021-06-01';

-- 5. Mostre os 5 vídeos com a menor duração, listando o título do vídeo, a tag ou tags que possuem, o nome de usuário e o país ao qual correspondem.

select video.titulo AS titulo_do_video, hashtag.nome AS Tag, usuario.nome AS Nome_Usuario, pais.nome AS Pais, video.duracao from video
left join video_hashtag on video.idVideo = video_hashtag.video_idVideo
left join hashtag on video_hashtag.hashtag_idHashtag = hashtag.idHashtag
left join usuario on video.usuario_idUsuario = usuario.idUsuario
left join pais on usuario.Pais_idPais = pais.idPais
order by video.duracao asc 
limit 5;

-- 6. Liste todas as playlists que possuem menos de 3 vídeos, mostrando o nome de usuário e avatar que possuem.

select `playlist`.nome AS Playlist, `usuario`.nome AS Nome_Usuario, `avatar`.nome AS Avatar, COUNT(`playlist_video`.video_idVideo)
from playlist
left join playlist_video on playlist.idPlaylist = playlist_video.Playlist_idPlaylist
left join usuario on playlist.usuario_idUsuario = usuario.idUsuario
left join avatar on usuario.Avatar_idAvatar = avatar.idAvatar
group by playlist_video.Playlist_idPlaylist
having COUNT(`playlist_video`.video_idVideo) < 3;

-- 7. Insira um novo avatar e atribua-o a um usuário.

INSERT INTO avatar ( nome, urlimagem)
VALUES ('Avatar novo', 'www.avatarnovo.com');

update usuario set usuario.Avatar_idAvatar = 90 
where Avatar_idAvatar = 40;

-- 8. Gere um relatório de estilo de classificação de avatares usados ​​por país.

-- 9. Insira um usuário com os seguintes dados: Nome: Roberto Rodriguez; E-mail: rrodriguez@dhtube.com; Password: rr1254; Data de nascimento: 01 de novembro de 1975; Código postal: 1429; País: Argentino; Avatar: carita feliz 

-- 10. Gere um relatório de todos os vídeos e suas hashtags, mas apenas aqueles cujos nomes de hashtags contêm menos de 10 caracteres, classificados em ordem crescente pelo número de caracteres na hashtag.