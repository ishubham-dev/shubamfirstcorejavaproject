create table Appointment(
Appointment_ID int,
patient_ID int,
Doc_ID int,
Appointment_Date date not null,
primary key(Appointment_ID),
foreign key(patient_ID) references Patients(patient_ID),
foreign key(Doc_ID) references Doctor(Doc_ID)
);

insert into  Appointment values
(201,101,101,'2026-08-01');

insert into  Appointment values
(202,101,102,'2026-08-05');

insert into  Appointment values
(203,102,101,'2026-08-02');

insert into  Appointment values
(204,103,103,'2026-08-03');

select*from Appointment;

