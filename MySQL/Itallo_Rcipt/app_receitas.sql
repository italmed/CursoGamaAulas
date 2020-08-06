create database AppReceitas;
use AppReceitas;
drop table receitas;
create table receitas(
	idReceita int not null auto_increment,
    nomeReceita varchar(100) not null,
    categoria varchar(30),
    tempoPreparo int,
    modoPreparo text,
    constraint pk_idReceita primary key (idReceita)
    );
drop table ingredientes;
create table ingredientes(
	idReceita int not null,
    ingrediente varchar(40),
    ingredObrigatorio enum('S', 'N'),
    constraint fk_idReceita foreign key (idReceita) references receitas(idReceita)
    );
    
insert into receitas values(null, 'Croquete Russo', 'Petiscos', 90 , 'Descrição do modo de preparo aqui.');
insert into receitas values(null, 'Frango assado', 'Assados', 100 , 'Descrição do modo de preparo aqui.');
insert into receitas values(null, 'Ovo frito', 'Acompanhamentos', 6 , 'Descrição do modo de preparo aqui.');

insert into ingredientes values(1, 'Filé de frango', 'S');
insert into ingredientes values(1, 'Manteiga', 'S');
insert into ingredientes values(1, 'Ervas finas', 'N');
insert into ingredientes values(1, 'Farinha de rosca', 'S');
insert into ingredientes values(1, 'Ovo', 'N');

insert into ingredientes values(2, 'Frango inteiro', 'S');
insert into ingredientes values(2, 'Alho', 'S');
insert into ingredientes values(2, 'Cebola', 'N');
insert into ingredientes values(2, 'Laranja', 'S');
insert into ingredientes values(2, 'Bacon', 'N');

insert into ingredientes values(3, 'Ovo', 'S');
insert into ingredientes values(3, 'Óleo', 'S');


select * from ingredientes;

#selecionar todos os ingredientes de uma receita x
select * from ingredientes inner join receitas using (idReceita)
where receitas.nomeReceita like '%assado%';

#dizer os ingredietnes e a consulta retorna quantos ingredientes dão match por receita
select receitas.nomeREceita as Receita, count(ingredientes.ingrediente) as "Match de ingredientes" 
	from receitas inner join ingredientes using(idReceita) 
	where ingredientes.ingrediente like '%Frango%' 
    or ingredientes.ingrediente like 'cebola' or ingredientes.ingrediente like 'ovo' or ingredientes.ingrediente like 'alho' 
    group by receitas.nomeReceita order by count(ingredientes.ingrediente) desc;

select receitas.nomeReceita, ingredientes.ingrediente from receitas inner join ingredientes using(idReceita) 
where ingredientes.ingrediente like '%Frango%' or ingredientes.ingrediente like '%cebola%';

-- selecionar a primeira receita que mais combina com a pesquisa realizada com base nos ingredientes

#dizer os ingredietnes e a consulta retorna quantos ingredientes dão match por receita
select receitas.nomeREceita as Receita
	from receitas inner join ingredientes using(idReceita) 
	where ingredientes.ingrediente like '%Frango%' 
    or ingredientes.ingrediente like 'cebola' or ingredientes.ingrediente like 'ovo' or ingredientes.ingrediente like 'alho' 
    group by receitas.nomeReceita order by count(ingredientes.ingrediente) desc 
    LIMIT 1;

#dizer os ingredientes e a consulta retorna diretamente a receita que melhor combina, com os ingredientes dela.
SELECT * from receitas inner join ingredientes using(idReceita)
WHERE receitas.nomeReceita = (select receitas.nomeREceita as Receita
	from receitas inner join ingredientes using(idReceita) 
	where ingredientes.ingrediente like '%frango%' 
    or ingredientes.ingrediente like '%ovo%'
    group by receitas.nomeReceita order by count(ingredientes.ingrediente) desc 
    LIMIT 1);