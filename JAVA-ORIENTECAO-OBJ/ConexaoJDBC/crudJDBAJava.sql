create database CrudRecodeMoodle;

use CrudRecodeMoodle;

create table Contatos (
	id int primary key identity(1,1) not null,
	nome varchar(max),
	idade int,
	dataCadastro Date
);

select * from Contatos;


--drop table Contatos;