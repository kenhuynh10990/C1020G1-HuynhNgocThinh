drop database if exists quan_ly_thu_vien;
create database quan_ly_thu_vien;

use quan_ly_thu_vien;


create table student(
student_number varchar(15) primary key,
student_name varchar(50) not null,
address varchar(500),
email varchar(50),
image blob
);

create table category(
category_id int primary key,
category_name varchar(50) 
);
create table book(
book_id int primary key,
book_name varchar(50),
company varchar(50),
author varchar(50),
publish_year date,
pulish_count int,
price double,
image blob,
category_id int,
foreign key(category_id) references category(category_id)
);



create table borrow_order(
student_number varchar(15),
book_id int,
primary key(student_number,book_id),
foreign key(student_number) references student(student_number),
foreign key(book_id) references book(book_id)
);

