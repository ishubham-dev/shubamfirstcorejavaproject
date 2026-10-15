use batch80;
create table celebrity(
celebrity_ID int,
celebrity_NAME varchar(50),
celebrity_AGE int,
celebrity_DOB varchar(20),
primary key(celebrity_ID)
);

insert into celebrity values
(1,'Virat Kholi',39,'10-11-1993');

insert into celebrity values
(2,'Alia bhatt',33,'07-12-1998');

update celebrity
set celebrity_DOB = '10-11-1993'
where celebrity_ID = 1;

select * from celebrity;