delete from user;
delete from company;

drop database freeform;
create database freeform;



create table user (
    id int(8) UNSIGNED AUTO_INCREMENT PRIMARY KEY
);

create table company (
    id int(8) UNSIGNED AUTO_INCREMENT PRIMARY KEY
);


alter table company add constraint FKdmip380 foreign key (createdById) references user (id);

select * from freeform.user;

select * from freeform.company;

update user set version=30;

insert into company(id,address,city,state,postcode,companyname) values(1,'5050 strand way','grand forks', 'nD','58201','The big oil company');

update user set parentCompanyid=1;

create table group (id integer not null auto_increment, address varchar(255), address2 varchar(255), city varchar(255), postCode varchar(255), state varchar(255), groupName varchar(255), primary key (id))]
