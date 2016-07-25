create sequence commodity_seq;
create table commodities(id number primary key,cname varchar2(20),price number(6,2),backGround varchar2(40),count number(4));
select * from commodities;
create sequence food_seq;


create table Food(fId number primary key,fName varchar2(20), mId number(4),fPrice number(6,2),fViewPath varchar2(80))
insert into FOOD (fId,fName,mId,fPrice,fViewPath) values (food_seq.nextval,'donut',1,20,'http://usr.im/200x150');
select * from FOOD;

select * from food where mId=1;



create sequence merchant_seq;
create table merchant(mId number primary key,mPersonName varchar2(20), mTel number(20),mIdCard number(20),mCarfPath varchar2(80),
mLocation varchar2(80),mBrand varchar2(80),mLogoPath varchar2(80),mPassword varchar2(80));
insert into merchant (mId,mPersonName,mTel,mIdCard,mCardPath,mLocation,mBrand,mLogoPath,mPassword) 
values (merchant_seq.nextval,'Sunvin','7626110','4413855647789576','http://usr.im/200x150','ZhuHai','SUN','http://usr.im/200x150','123465');
select * from merchant;


drop table merchant;
drop table Food;



create table userLogin(name varchar2(20),password varchar2(20));
insert into userLogin (name,password) values (123,456);