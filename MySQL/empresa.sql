#criação de uma nova base de dados

create database empresa;

use empresa; #coloca a database empresa como padrão

#drop table departamento if exists; # utilizar if exists para apagar somente se a tabela existir para não dar erro no script

#criar tabela de departamentos (DDL - Estrutrura)

create table departamento(
	idDepto int not null auto_increment,
    nomeDep varchar(50),
    andar smallint,
    constraint pk_departamento primary key (idDepto)
);
    
    #ralacaão 1:n entre funcionarios e departamentos (um func está em um dep apenas, mas um dep tem varios funcs)
create table funcionario(
    idFunc int not null auto_increment,
    nome varchar(100) not null,
    email varchar(80),
    sexo enum('M', 'F') not null,
    dataAdm date,
    salario float,
    idDepto int,
    constraint pk_funcionario primary key (idFunc),
    constraint fk_func_depto foreign key (idDepto) references departamento(idDepto)
);
    
create table projeto(
	idProj int not null auto_increment,
	titulo varchar(40),
	constraint pk_projeto primary key (idProj)
);

create table projFunc(
	idFunc int not null,
    idProj int not null,
    constraint pk_projfunc primary key (idFunc, idProj),
    constraint fk_func_projFunc foreign key (idFunc) references funcionario(idFunc),
    constraint fk_proj_projFunc foreign key (idProj) references projeto(idProj)
);

#inserir dadados nas tabelas (DML - manipulação de dados)
#repare que departamento ()  esta vazio, isto por vamos respeitar a ordem das colunas

insert into departamento () values (null, 'Engenharia', 15);
insert into departamento () values (null, 'TI', 16);
insert into departamento () values (null, 'Financeiro', 15);
insert into departamento () values (null, 'Compras', 15);

insert into funcionario values (null, 'Carlos Silva', 'carlos@empresa.com',  'M', '2020-01-10', 4500, 1);
insert into funcionario values (null, 'João Batista', 'joao@empresa.com',  'M', '2020-03-11', 1800, 2);
insert into funcionario values (null, 'Larissa Avelar', 'larissa@empresa.com',  'F', '2018-06-13', 700, 3);
insert into funcionario values (null, 'Jussara Feitosa', 'jusara@empresa.com',  'F', '2014-05-16', 7800, 2);
insert into funcionario values (null, 'Armando Paiva', 'armando@empresa.com',  'F', '2011-10-12', 12900, 4);

insert into projeto values (null, 'Nova rodovia BR-123');
insert into projeto values (null, 'Ponte de londres');
insert into projeto values (null, 'Igreja Matriz');

insert into projfunc values (1,1);
insert into projfunc values (1,3);
insert into projfunc values (2,2);
insert into projfunc values (4,3);
insert into projfunc values (4,2);

#consulta aos dados
select * from funcionario;  #todos os funcionarios

#consulta apenas nome e email dos funcionarios
select nome, email from funcionario;

#procurar por funcionario chamado Armando
select nome, email from funcionario where nome like 'armando%';

#pode dar enter e quebrar linha
SELECT nome, email FROM funcionario WHERE nome LIKE 'armando%'; # % retorna tudo que vier depois

#inner joi serve pra trazer tudo das duas tabelas, mas ele aplica multiplicação dos fatores
select * from funcionario inner join departamento on funcionario.idDepto = departamento.idDepto;

#selecionando apenas o nome do funcionario com o departamento 
#solução 1
select funcionario.nome, departamento.nomeDep 
from funcionario inner join departamento on funcionario.idDepto = departamento.idDepto;

#selecionando apenas o nome do funcionario com o departamento 
#solução 2
select funcionario.nome, departamento.nomeDep 
from funcionario inner join departamento using(idDepto);

#listar todos os func e seus projt
select funcionario.nome, projeto.titulo
from funcionario inner join projfunc using (idfunc) #primeiro faz essa busca
	inner join projeto using(idProj) order by funcionario.nome; #depois join com essa
    
#listar todos os func e seus projt, mesmo os funcionarios sem projetos
select funcionario.nome, projeto.titulo 
from funcionario left join projfunc using (idfunc) 
	left join projeto using(idProj) order by funcionario.nome; #depois join com essa

#m quantos projetos cada func está alocado
select funcionario.nome Nome, count(idFunc)'Numero de Projetos'
from funcionario inner join projfunc using (idfunc) 
	inner join projeto using(idProj)
    group by idFunc;
    
#mostrar a média dos salarios
select avg(salario) from funcionario;

#quais sao os funcionarios que ganham acima da media:
select nome, salario from funcionario 
where salario > (select avg(salario) from funcionario) ;

#quem foi contratado em 2020? #solucao 1
select nome, dataAdm from funcionario
where dataAdm > '2020-01-01' order by dataAdm;

#quem foi contratado em 2020? #solucao 2
select nome, dataAdm from funcionario
where dataAdm > str_to_date('01/01/2020', '%d/%m/%Y') order by dataAdm;