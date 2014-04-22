-- DELETE FROM Automovel;
-- DELETE FROM Automovel where marca <> 'Chevrolet'

DELETE FROM link;
DELETE FROM Indice;
DELETE FROM log;

-- DELETE FROM link where contexto = 'http://www.seminovosbh.com.br'

select * from Automovel order by id desc;

select * from link order by id desc;

select * from indice order by id desc;

select * from (SELECT * FROM automovel ORDER BY id DESC) WHERE ROWNUM <= 5;
SELECT * FROM automovel ORDER BY id DESC LIMIT 10;

SELECT * FROM log ORDER BY id DESC LIMIT 10;



select * from indice where upper(chave) like upper('%moto%') order by id desc;


insert into link (href, contexto, conteudo, situacao) values ('/teste', 'http://www.teste.com', '', 'SNR');

insert into link (href, contexto, conteudo, situacao) values ('', 'http://www.seminovosbh.com.br', '', 'SNR');



update link set situacao = 'SUI' where id = 883;


