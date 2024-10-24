CREATE DATABASE  tidev2b;
CREATE DATABASE   tidevsesisenai;
USE tidev2b;
USE tidevsesisenai;
DROP DATABASE tidevsesisenai;
DROP DATABASE tidev2b;
CREATE DATABASE  tidev2b;
USE sys;
CREATE TABLE clientes (
idClientes INT,
nome VARCHAR(100),
endereco VARCHAR(150)
);
INSERT INTO clientes VALUES (1,'Riki','rua dos amores, bairro  do coracao, n3 ');
INSERT INTO clientes (nome, idClientes) VALUES ('riki', 6);
SELECT * FROM clientes; 
SELECT endereco FROM clientes;
SELECT idClientes, endereco FROM clientes;
CREATE DATABASE senai;
USE senai;
CREATE TABLE funcionarios (
id INT ,
nome VARCHAR(100),
salario DECIMAL(10,2),
adimissao DATE,
sexo ENUM('f','m'),
cadastro TIMESTAMP DEFAULT current_timestamp()
);
INSERT INTO funcionarios VALUES (1, 'Riki', 4496.56,'2023-02-28', 'm', NULL);
SELECT * FROM funcionarios;
INSERT INTO funcionarios (id, nome, adimissao) VALUES (2, 'joao', '2023-08-10');
INSERT INTO funcionarios VALUES (3, 'Ryan', 3500.80,'2023-09-28', 'm', NULL);
INSERT INTO funcionarios VALUES (4, 'Rebeca', 10982.93,'2023-05-30', 'f', NULL);
INSERT INTO funcionarios VALUES (5, 'Ricardo', 24566.56,'2023-06-18', 'm', NULL);
INSERT INTO funcionarios VALUES (6, 'Rosa', 4496.56,'2023-03-28', 'f', NULL);
INSERT INTO funcionarios VALUES (7, 'Renato', 4496.46,'2024-12-28', 'm', NULL);
DELETE FROM funcionarios;
SELECT * FROM funcionarios;
CREATE DATABASE escola 
