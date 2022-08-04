
create database split_dine;

use split_dine;

create table dish ( 
	dish_id int primary key auto_increment,
    name varchar(30) not null,
    description varchar(200),
	image blob,
    price decimal(5,2) not null,
	dish_type varchar(30) not null
);

create table order_s (
	order_id int primary key auto_increment,
    cust_id int not null,
    order_amt decimal(7,2)
);

create table order_details (
	order_id int,
    dish_id int, 
    dish_count int,
	is_split BOOLEAN,
	split_with varchar(200),
    primary key(order_id, dish_id),
    FOREIGN KEY (dish_id) REFERENCES dish(dish_id),
    FOREIGN KEY (order_id) REFERENCES order_s(order_id)
 );

create table customer(
	custId int primary key auto_increment,
    cust_name varchar(30),
	cust_email varchar(200) not null
);

