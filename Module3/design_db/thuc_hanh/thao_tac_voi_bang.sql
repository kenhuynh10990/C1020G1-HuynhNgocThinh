
create database thuc_hanh;
use thuc_hanh;
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);


ALTER TABLE contacts
MODIFY last_name varchar(50) NULL;

ALTER TABLE contacts CHANGE COLUMN first_name ctype varchar(20) NOT NULL;
    
ALTER TABLE contacts
RENAME TO people;