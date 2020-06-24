CREATE DATABASE IF NOT EXISTS customer_product;

CREATE TABLE`customer_product`.`customer` ( `c_id` INT, `name` VARCHAR( 50 ) , `address` TEXT , `email` TEXT , `phone` VARCHAR( 12 ) ) ENGINE= MYISAM ;

CREATE TABLE`customer_product`.`product` ( `p_id` INT  ,`name` VARCHAR( 30 ) , `type` VARCHAR( 50 ) , `barcode` VARCHAR( 12 ) ) ENGINE= MYISAM ;

CREATE TABLE`customer_product`.`order` ( `c_id` INT , `p_id` INT , `Quantity` INT , `price` FLOAT( 10,2 )) ENGINE= MYISAM ;

insert into `customer_product`.`customer` values(1, "Shivanshu", "Jamnagar", "ajaj@gmail.com", "884934727" );
insert into `customer_product`.`customer` values(2, "Ahbishek", "Ahmedabad", "abhi@gmail.com", "884544727" );
insert into `customer_product`.`customer` values(3, "Darshan", "Surat", "dar@gmail.com", "898934727" );
insert into `customer_product`.`customer` values(4, "Rohit", "Ahmey", "rohit@gmail.com", "999934727" );
insert into `customer_product`.`customer` values(5, "Vijay", "Rajkot", "Vijay@gmail.com", "873734727" );


insert into `customer_product`.`product` values(1, "Realme 3","Smartphone", "14151617" );
insert into `customer_product`.`product` values(2, "Acer aspire", "Laptop", "1333617" );
insert into `customer_product`.`product` values(3, "sony", "TV", "1417717" );
insert into `customer_product`.`product` values(4, "apple watch",  "Smartwatch", "3651617" );


insert into `customer_product`.`order` values(1, 2, 4, 50000.25 );
insert into `customer_product`.`order` values(2, 2, 4, 22000.75 );
insert into `customer_product`.`order` values(3, 1, 4, 5000.25 );
insert into `customer_product`.`order` values(4, 3, 4, 15000.85 );

select * from `customer_product`.`customer`;
select * from `customer_product`.`product`;
select * from `customer_product`.`order`;