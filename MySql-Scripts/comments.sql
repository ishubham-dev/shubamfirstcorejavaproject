create table comments(
Comment_ID int,
celebrity_ID int,
user_ID int,
comment_TEXT varchar(50),
Comment_DATE timestamp,
primary key(Comment_ID),
foreign key(celebrity_ID) references celebrity (celebrity_ID),
foreign key(user_ID) references USERS (user_ID)
);

insert into comments values
(201,1,1,'Very Good Shot','2026-10-6 00:00:00');

insert into comments values
(202,2,2,'Looking beautiful','2026-10-6 00:00:00');

select *from comments;