create sequence commodity_seq;
create table commodities(id number primary key,cname varchar2(20),price number(6,2),backGround varchar2(40),count number(4));
select * from commodities;


drop table commodities;



create table userLogin(name varchar2(20),password varchar2(20));
insert into userLogin (name,password) values (123,456);