CREATE DATABASE IF NOT EXISTS custpro;

CREATE TABLE`custpro`.`customer` ( `cid` INT NOT NULL, `name` TEXT , `address` TEXT , `email` TEXT , `phone` TEXT );

CREATE TABLE`custpro`.`product` ( `pid` INT NOT NULL ,`name` TEXT , `type` TEXT , `barcode` TEXT, `price` FLOAT ) ;

CREATE TABLE`custpro`.`order` ( `cid` INT , `pid` INT , `Quantity` INT) ;

insert into `custpro`.`customer` values(1, "Shivanshu", "Jamnagar", "ajaj@gmail.com", "884934727" );
insert into `custpro`.`customer` values(2, "Ahbishek", "Ahmedabad", "abhi@gmail.com", "884544727" );
insert into `custpro`.`customer` values(3, "Darshan", "Surat", "dar@gmail.com", "898934727" );
insert into `custpro`.`customer` values(4, "Rohit", "Ahmey", "rohit@gmail.com", "999934727" );
insert into `custpro`.`customer` values(5, "Vijay", "Rajkot", "Vijay@gmail.com", "873734727" );


insert into `custpro`.`product` values(1, "Realme 3","Smartphone", "14151617", 15000 );
insert into `custpro`.`product` values(2, "Acer aspire", "Laptop", "1333617", 50000 );
insert into `custpro`.`product` values(3, "sony", "TV", "1417717", 80000 );
insert into `custpro`.`product` values(4, "apple watch",  "Smartwatch", "3651617", 100000 );


insert into `custpro`.`order` values(1, 2, 4);
insert into `custpro`.`order` values(2, 2, 4 );
insert into `custpro`.`order` values(3, 1, 4 );
insert into `custpro`.`order` values(4, 3, 4 );

select * from `custpro`.`customer`;
select * from `custpro`.`product`;
select * from `custpro`.`order`;
