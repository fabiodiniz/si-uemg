/* CRUD */
CREATE TABLE Aluno (
	idAluno number (4) not null,
	nome char (10),
	cidade char (10)
)

INSERT INTO Aluno(idAluno, nome, cidade) values (201, 'JOSE', 'Frutal')
SELECT * FROM Aluno
UPDATE Aluno SET nome = '' WHERE nome = ''
DELETE FROM Aluno WHERE nome = ''

/* INNER, OUTER, LEFT, RIGHT JOIN */
SELECT emp.nome_emp, dep.nome_dep FROM emp
INNER JOIN dep ON emp.n_dep = dep.n_dep ORDER BY emp.nome_emp

/* VIEWS */
CREATE VIEW AlunoFrutal
	AS SELECT idAluno, nome, cidade
	FROM Aluno
	WHERE cidade = 'Frutal'

INSERT INTO AlunoFrutal(idAluno, nome, cidade) VALUES (202,'JULIA','Planura')
SELECT * FROM AlunoFrutal
DROP VIEW AlunoFrutal