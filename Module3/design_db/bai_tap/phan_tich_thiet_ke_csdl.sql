drop database if exists oto;
create database oto;
use oto;

create table offices(
office_code varchar(10) primary key not null,
city varchar(50) not null,
phone varchar(50) not null,
address_line_1 varchar(50) not null,
address_line_2 varchar(50),
state varchar(50),
country varchar(50) not null,
postal_code varchar(15) not null
);

create table employees(
employee_id int primary key not null,
last_name varchar(50) not null,
first_name varchar(50) not null,
email varchar(100) not null,
job varchar(50) not null,
office_code varchar(10),
foreign key (office_code) references offices(office_code),
report_to int not null,
foreign key (report_to) references employees(employee_id)
);

create table customers(
customer_number int primary key not null,
customer_name varchar(50) not null,
contact_last_name varchar(50) not null,
contact_first_name varchar(50) not null,
customer_phone int not null,
address_line_1 varchar(50) not null,
address_line_2 varchar(50) ,
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(50) not null,
country varchar(50) not null,
employee_id int,
foreign key (employee_id) references employees(employee_id)
);

create table orders(
order_number int primary key not null,
date_buy date not null,
date_delivery date not null,
real_time date,
`status` varchar(15) not null,
comments text,
quantity_ordered int not null,
price_each double not null,
customer_number int,
foreign key (customer_number) references customers(customer_number)
);

create table payments(
check_number varchar(50) not null,
pay_date date not null,
cost double not null,
customer_number int,
foreign key (customer_number) references customers(customer_number)
);

create table products_line(
product_line_id varchar(50) primary key not null,
product_description text,
image varchar(50)
);

create table products(
product_code varchar(15) primary key not null,
product_name varchar(70) not null,
product_scale varchar(10) not null,
product_vendor varchar(50) not null,
product_description text not null,
quantity_in_stock int not null,
input_cost double not null,
sale double not null,
product_line_id varchar(50),
foreign key (product_line_id) references products_line(product_line_id)
);

create table order_detail(
order_number int,
product_code varchar(15),
primary key (order_number, product_code),
foreign key (order_number) references orders(order_number),
foreign key (product_code) references products(product_code)
);