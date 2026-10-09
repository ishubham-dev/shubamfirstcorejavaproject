use batch80;
create table Store1(
store_ID int,
store_NAME varchar(50),
manager_ID varchar(20),
primary key(store_ID)
);

insert into Store1 values
(101,'Main st.Grocery','M101'),
(202,'Elm Ave.Electronics','M102'),
(303,'Oak Blvd.Apparel','M103');

select*from Store1;