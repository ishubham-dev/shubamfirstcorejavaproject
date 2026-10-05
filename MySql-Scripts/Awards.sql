create table Awards(
Award_ID int,
celebrity_ID int,
Award_NAME varchar(50),
Award_YEAR int,
primary key(Award_ID),
foreign key (celebrity_ID) references celebrity(celebrity_ID)
);

insert into Awards values
(101,1,'Cricketer of the year',2018);

insert into Awards values
(102,2,'Filmfare',2022);

select *from Awards;
