use batch80;
create table Patients(
patient_ID int,
patient_NAME varchar(40),
patient_Email varchar(100),
patient_MOB bigint,
primary key(patient_ID)
);
 insert into Patients values
 (101,'Suresh Kumar','sureshkumar@gmail.com',63038662);
 
insert into Patients values
(102,'Anita Roy','anitaroy@gmail.com',3640561666);

insert into Patients values
(103,'Vikas Sharma','vikasharma@gmail.com',86255455);

select *from Patients;
 
 
 
 
