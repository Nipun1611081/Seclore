/* DDL - create, alter, drop table */

drop database secloredb;

create database secloredb;

use secloredb;

create table employee_master
(
	employee_id int,
    first_name varchar(20),
    last_name varchar(20),
    salary double
);

select * from employee_master;

insert into employee_master values(101,'Vivek','Gohil',1000);

alter table employee_master
add department varchar(30);

alter table employee_master
drop column department;

alter table employee_master
modify column salary int;

alter table employee_master
modify column salary double;

drop table employee_master;

select * from employee_master;

-- Constraints
-- 1. NOT NULL
drop table employee_master;
create table employee_master
(
	employee_id int not null,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double
);

insert into employee_master values(null,'Vivek','Gohil',1000);

alter table employee_master
modify salary double not null;

insert into employee_master values(101,'Vivek','Gohil',null);

-- 2. Unique
drop table employee_master;
create table employee_master
(
	employee_id int not null UNIQUE,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double
);

insert into employee_master values(101,'Vivek','Gohil',null);
insert into employee_master values(101,'Reema','Patil',null);
describe employee_master;
drop table employee_master;


create table employee_master
(
	employee_id int not null,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
   constraint UC_employee UNIQUE (employee_id,first_name)
);


insert into employee_master values(101,'Vivek','Gohil',null);
insert into employee_master values(101,'Reema','Patil',null);
insert into employee_master values(101,'Vivek','Patil',null);
insert into employee_master values(102,'Vivek','Patil',null);

select * from employee_master;

alter table employee_master
drop index UC_employee;

alter table employee_master
drop index employee_id;

alter table employee_master
add constraint UC_employee unique (employee_id,first_name);

show indexes in employee_master;

-- Primary key 
drop table employee_master;
create table employee_master
(
	employee_id int primary key,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double
);

insert into employee_master values(101,'Vivek','Gohil',null);
insert into employee_master values(null,'Reema','Patil',null);

create table employee_master
(
	employee_id int,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    constraint PK_employee primary key (employee_id , first_name)
);
insert into employee_master values(101,'Vivek','Gohil',null);
insert into employee_master values(101,'Reema','Patil',null);
insert into employee_master values(101,'Vivek','Patil',null);
insert into employee_master values(102,'Vivek','Patil',null);

alter table employee_master
drop primary key;

alter table employee_master
add constraint PK_employee primary key (employee_id , first_name);

show indexes in employee_master;

-- RDBMS
-- Project_Master 
	-- project_id -- pk
	-- name
    
-- Employee_Master
		-- employee_id -- pk
        -- project_id -- fk
		-- first_name
        -- last_name
        -- salary
drop table employee_master;
create table project_master
(
	project_id int primary key,
    name varchar(20)
);

drop table employee_master;
create table employee_master
(
	employee_id int,
    project_id int,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    constraint PK_employee primary key (employee_id , project_id),
    constraint FK_project_id foreign key (project_id) references project_master(project_id)
);

alter table employee_master
drop foreign key FK_project_id;

select * from project_master;
insert into employee_master values(1, 101,'Vivek','Gohil',null);
insert into employee_master values(2, 101,'Reema','Patil',null);
insert into employee_master values(3, 101,'Vivek','Patil',null);
insert into employee_master values(4 ,102,'Vivek','Patil',null);
insert into employee_master values(5 ,109,'Vivek','Patil',null);
insert into employee_master values(5 ,109,'Vivek','Patil',null);

create table employee_master
(
	employee_id int,
    project_id int,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    primary key (employee_id),
    foreign key (project_id) references project_master(project_id)
);

create table employee_master
(
	employee_id int,
    project_id int,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    primary key (employee_id),
    constraint FK_project_id
    foreign key (project_id) references project_master(project_id)
);

insert into project_master values(101 , 'Google Pay UPI');
insert into project_master values(102 , 'PayTM UPI');

insert into employee_master values(1,101,'Vivek','Gohil',1000);
insert into employee_master values(3,101,'Pratik','Nerurkar',1000);
insert into employee_master values(2,109,'Reema','Sawant',1000);

truncate table employee_master;

alter table employee_master
drop foreign key FK_project_id;

alter table employee_master
add constraint fk_project foreign key (project_id) references project_master(project_id);

select * from employee_master;
select * from project_master;

show indexes in employee_master;

-- Check

drop table employee_master;
create table employee_master
(
	employee_id int primary key,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    constraint ck_salary check(salary > 0)
);

insert into employee_master values(109,'Reema','Sawant',1000);
insert into employee_master values(101,'','Sawant',1000);

alter table employee_master
add constraint ck_first_name check(length(first_name) > 0);

alter table employee_master
drop check ck_first_name;

-- default

drop table employee_master;
create table employee_master
(
	employee_id int primary key,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    city varchar(30) Default 'MUMBAI'
);

insert into employee_master(employee_id,first_name,last_name,salary)
value(101,'Pramod','Sawant',1000);

select * from employee_master;

alter table employee_master
alter city drop default;

alter table employee_master
alter city set default 'MUMBAI';

-- Auto Increment
drop table employee_master;

create table employee_master
(
	employee_id int primary key auto_increment,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    city varchar(30) Default 'MUMBAI'
);

select * from employee_master;

insert into employee_master(first_name,last_name,salary,city) values('Vivek','Gohil',1000,'NAGPUR');
insert into employee_master(first_name,last_name,salary,city) values('Reema','Sawant',1000,'NAGPUR');
insert into employee_master(first_name,last_name,salary,city) values('Raj','Sawant',1000,'NAGPUR');
insert into employee_master(first_name,last_name,salary,city) values('Seema','Patil',1000,'Mumbai');

alter table employee_master auto_increment =1000;


select * from employee_master;

-- DML insert, update, delete

update employee_master set city = 'Chandrapur' where employee_id = 1001;
update employee_master set city = 'MUMBAI' , salary = 1900 where employee_id = 1001;

update employee_master set city = 'MUMBAI';

delete from employee_master where city = 'MUMBAI';
delete from employee_master where employee_id = 1001;

-- Select all/Specific colums

select * from employee_master;

select employee_id , first_name , last_name from employee_master;
select employee_id , first_name , last_name from employee_master where city = 'MUMBAI';

-- Group By 

drop table sales;
drop table employee_master;

create table employee_master
(
	employee_id int primary key auto_increment,
    first_name varchar(20) not null,
    last_name varchar(20),
    salary double,
    city varchar(30) Default 'MUMBAI'
);

select * from employee_master;
insert into employee_master(first_name,last_name,salary,city) values('Vivek','Gohil',1000,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Aaditya','Rane',1300,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Abhishek','Mingal',1200,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Abid','Kapadi',1200,'NAVI MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Aditya','Pingle',1200,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Atharva','Sawant',1200,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Calden','Rodrigues',1100,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Hemkant','Patil',1200,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Navjot Singh','Rajput',1200,'NAVI MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Nipun','Iyer',1100,'THANE');
insert into employee_master(first_name,last_name,salary,city) values('Pratik','Nerurkar',1100,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Rupali','Jaiswal',1200,'MUMBAI');
insert into employee_master(first_name,last_name,salary,city) values('Saurabh','Singh',1200,'PALGHAR');
insert into employee_master(first_name,last_name,salary,city) values('Shreyash','Pimpalshende',1100,'CHANDRAPUR');
insert into employee_master(first_name,last_name,salary,city) values('Vishal','Dalvi',1200,'MUMBAI');

select count(employee_id) from employee_master group by city;
select count(employee_id), city from employee_master group by city;
select max(salary) , city from employee_master group by city;
select max(salary) , city from employee_master group by city order by max(salary) desc;

select * from  employee_master where salary > 1200;
select count(city) , city from  employee_master where salary > 1200 group by city having count(city) >= 1;
select count(city) , city from  employee_master group by city having count(city) >= 1 and salary > 1200; 

 
select count(employee_id) from employee_master group by city ;
select count(employee_id),city,max(salary) from employee_master group by city having max(salary) >= 1200;

-- order by
select * from employee_master;
select * from employee_master order by city;
select * from employee_master order by city desc;
select employee_id, first_name,salary,city from employee_master;
select employee_id, first_name,salary,city from employee_master order by city;
select employee_id, first_name,salary,city from employee_master order by city desc;
select employee_id, first_name,salary,city from employee_master order by city desc , salary desc;
select employee_id, first_name,salary,city from employee_master order by city desc , salary desc , first_name desc;
































