create table  UserStores(
userID int not null,
storeID int ,
active boolean default true,
primary key(userID,storeID),
foreign key(userID) references user(userID),
foreign key(storeID) references Stores(storeID),
unique (userID)
);
 select*from UserStores;
 
 insert into UserStores values(04,2,0);