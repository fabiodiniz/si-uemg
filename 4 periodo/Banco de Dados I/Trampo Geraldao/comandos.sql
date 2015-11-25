CREATE TABLE Cliente (
	idCliente number (8)primary key,
	nome char (15)not null,
	sobrenome char(30)not null,
	telefone number (10)not null,
	rua char(20) not null,
	numero number(8) not null,
	complemento char(20),
	bairro char(20) not null,
	cidade char(10) not null,
	estado char(40) not null,
	cep number (8) not null
)

INSERT INTO Cliente VALUES ( 123,'Jonathas', 'Alves', 3523-5859,'rua tal',123,'fundo','gloria','Frutal','MG',12345678)
INSERT INTO Cliente VALUES ( 213,'Ruan', 'Sposito', 3542-7898,'rua das flores',456,'em cima','centro','Cedral','SP',98654321)
INSERT INTO Cliente VALUES ( 321,'Fabinho', 'Diniz', 3425-8975,'rua alfredo',789,'em baixo','alvorada','Frutal','MG',11795236)


SELECT * FROM Cliente


CREATE TABLE Animal(
	idAnimal number (8)primary key,
	nome_Animal char (10)not null,
	data_nasc date not null,
	espécie char(10) not null,
	raça char(10)not null,
	cor char(10)not null,
	sexo char(8)not null,
	dono number(8) references Cliente(idCliente)
)

INSERT INTO Animal VALUES (123,'repete','20/jan/2015','gato','seila','amarela','Femea',321)
INSERT INTO Animal VALUES (219, 'bronw', '10/jan/2015', 'Cachorro', 'Pitbull', 'Branco', 'Macho',213)
INSERT INTO Animal VALUES (327, 'amendoin', '01/jan/2015', 'Cachorro', 'DogAlemao', 'Caramelo', 'Femea',123)

SELECT * FROM Animal

CREATE TABLE Vacina (
	idVacina number (8) primary key not null,
	nome char(20) not null,
	lab_fabricante char(20) not null,
	lote_fabricacao char(20) not null
)

INSERT INTO Vacina VALUES (1, 'Vacina anti raiva', 'Medley', '2015A')
INSERT INTO Vacina VALUES (2, 'Vacina b2', 'farmamais', '2015B')
INSERT INTO Vacina VALUES (3, 'Vacina anticarrapato', 'Farma mais', '2015C')



SELECT * FROM Vacina

*****************************************
CREATE TABLE Aplicacao (
	cod_aplicacao number(8) primary key not null,
	Animal_Vacinado number(8) references Animal(idAnimal),
	Vacina_aplicada number(8) references Vacina(idVacina),
	data_aplicacao date not null,
	proxima_Vacina number(8) references Vacina(idVacina),
	data_aplicacao_proxima date not null
)

INSERT INTO aplicacao VALUES (123, 123, 1, '30/fev/2015', 1, '06/jun/2015')
INSERT INTO aplicacao VALUES (213, 213, 2, '30/fev/2015', 2, '06/jun/2015')
INSERT INTO aplicacao VALUES (321, 321, 3, '30/mar/2015', 3, '06/jun/2015')

***************************

UPDATE Animal
SET Nome = 'Mragaia'
WHERE Nome = 'amendoin'
DELETE FROM Cliente
WHERE nome = 'Fabinho'