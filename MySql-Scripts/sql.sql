use shubam78;
create table student(
sid int ,
stname varchar(40),
stloc varchar(40),
yop int,
fee int,
primary key(sid)
);
insert into student values (1,'shubham','ECIL',2026,30000),(2,'sahil','ECIL',2026,30000),(3,'ayush','ECIL',2026,30000);
select * from student;
alter table student
add column course varchar(40);
UPDATE student
SET course = 'Python'
WHERE sid = 2;

UPDATE student
SET course = 'C++'
WHERE sid = 3;



