--скрипт развертывания
create table example (
id int, name varchar);
insert into example(id, name) values (1, 'one');
insert into example(name, id) values ('two', 2);
insert into example values (3, 'three');
insert into example values (4, 'four'),
(5,'five'),
(6, 'six');
--Скрипт развертывания табл. Users
create table users (
id varchar,
password varchar
);
--Скрипт развертывания тпбл. msg
create table message (
sender varchar,
PostDateTime timestamp without time zone,
message varchar,
addresee varchar
);