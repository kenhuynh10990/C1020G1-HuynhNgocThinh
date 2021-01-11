create database bai_tap;

use bai_tap;
create table customers(
customer_number int primary key,
full_name varchar(50),
address varchar(50),
email varchar(50),
phone int
);

create table accounts(
account_number int primary key,
account_type varchar(20),
`date` date,
balance double ,
customer_number int,
foreign key (customer_number) references customers(customer_number)
);
create table transactions(
tran_number int primary key,
account_number int,
foreign key(account_number) references accounts(account_number),
`date` date,
amounts double,
descriptions text
);