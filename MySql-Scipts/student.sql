create table student1(
stno int,
stname varchar(40) not null,
branch varchar(30),
yop int,
courseid int not null,
primary key(stno),
foreign key(courseid) references course(courseid) on update cascade
);

insert into student1 values(