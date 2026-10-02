create table Products(
order_ID int,
Products varchar(50),
foreign key (order_ID) references orders (order_ID)
);

insert into Products values 
(01,'Laptop'),
(01,'Mouse'),
(02,'Phone'),
(03,'Tablet'),
(03,'Keyboard');

select*from Products;
