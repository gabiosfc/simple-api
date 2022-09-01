DROP TABLE IF EXISTS aluno;


CREATE TABLE aluno(id IDENTITY, nome, matricula, idade, curso) AS
SELECT NULL, * FROM CSVREAD('./src/main/resources/aluno.csv', null, 'fieldSeparator=;');