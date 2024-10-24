create database Escola;
use Escola;
create table Alunos (
id_Aluno int,
Nome_aluno varchar(100),
dtnasci date,
sexo enum('f','m'),
endereco varchar(100),
cidade varchar(100),
bairro varchar(60),
estado varchar(2),
cpf char(11),
email varchar(200),
telefone char(11)
);
INSERT INTO Alunos VALUES ( 123, 'Riki jose nunes de arruda', '2008-05-30', 'm', 'rua pocos de caldas', 'paraiso', 'aluminio',
 'SP', 54457067881, 'riki1arruda@gmail.com', 11963078678);
 insert into Alunos values
 (1235,'Maria Silva', '2000-05-14', 'f', 'Rua A', 'São Paulo', 'Centro', 'SP', '12345678901', 'maria.silva@example.com', 11987654321),
(65876,'João Santos', '1998-08-22', 'm', 'Avenida b', 'Rio de Janeiro', 'Copacabana', 'RJ', '23456789012', 'joao.santos@example.com', 21987654321),
(4135,'Ana Oliveira', '2001-12-30', 'f', 'Rua C', 'Belo Horizonte', 'Savassi', 'MG', '34567890123', 'ana.oliveira@example.com', 31987654321),
(9876,'Carlos Pereira', '1995-03-05', 'm', 'Praça D', 'Curitiba', 'Centro', 'PR', '45678901234', 'carlos.pereira@example.com', 41987654321),
(87654,'Fernanda Lima', '1999-11-11', 'f', 'Rua E', 'Porto Alegre', 'Moinhos de Vento', 'RS', '56789012345', 'fernanda.lima@example.com', 51987654321);
select * from Alunos  where id_Aluno = 123
select * from Alunos where cidade = 'São Paulo' and sexo = 'f'

update alunos set cidade = 'Aluminio' where sexo = 'm';





