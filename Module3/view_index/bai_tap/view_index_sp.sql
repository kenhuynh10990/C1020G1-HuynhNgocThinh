create database demo;
drop table products;
CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_code VARCHAR(20),
    product_name VARCHAR(50),
    product_price DOUBLE,
    product_amount INT,
    product_description VARCHAR(50),
    product_status VARCHAR(15)
);

create unique index idx_pro_code on products(product_code);

explain select *
from products
where product_code = 'da';

create index idx_name_price on products(product_name, product_price);

CREATE VIEW view_products AS
    SELECT 
        products.product_code,
        products.product_name,
        products.product_price,
        products.product_status
    FROM
        products;

SELECT 
    *
FROM
    view_products;

insert into view_products(product_code, product_name, product_price,product_status)
values('qdq','d',21,'da');

drop view view_products;


delimiter //
create procedure get_product()
begin
	select *
	from products;
end ;
// delimiter ;

delimiter //
create procedure insert_product(id int,
product_code varchar(20),
product_name varchar(50), 
product_price double,
product_amount int,
product_description varchar(50),
product_status varchar(15))
begin
insert into products
values (id,product_code,
product_name , 
product_price ,
product_amount,
product_description ,
product_status );
end;
// delimiter ;

call insert_product(5,'dasa1','s',212,2,'dsasa','das');

delimiter //
create procedure edit_product_by_id(id int,
product_code varchar(20),
product_name varchar(50), 
product_price double,
product_amount int,
product_description varchar(50),
product_status varchar(15))
begin
update products
set
product_code=product_code,
product_name =product_name, 
product_price=product_price ,
product_amount=product_amount,
product_description =product_description ,
product_status =product_status
where products.id= id;
end;
// delimiter ;

call edit_product_by_id(2,'3a','to',4,2,'ads','as');

delimiter //
create procedure delete_product(id int)
begin
delete from products where products.id = id;
end;
// delimiter ;

call delete_product(1);