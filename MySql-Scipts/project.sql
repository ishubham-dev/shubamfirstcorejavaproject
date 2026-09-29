use shubam78;
create table Franchise(
franchiseid int not null,
fname varchar(40)not null,
active boolean default true,
primary key (franchiseid)
);

select*from Franchise;

insert into Franchise values
(1,'Zomato',1),
(2,'swiggy',0); 


update franchise 
set active =1
where franchiseid=2;
