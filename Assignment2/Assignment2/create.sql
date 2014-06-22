create table Address
(
  AID char(15),
  Street_no char(15),
  street_add char(40),
  city char(30),
  state char(4),
  country char(50),
  zip number(12,0),
  primary key (AID) not null
);

create table Users
(
 email char(40),
 Passwd char(10),
 Fname char(20),
 Lname char(20),
 Birthdate date,
 country char(50),
  city char(30),
  state char(4),
  primary key (email) not null
);

create table live
(
Aid char(15),
 email char(40)
 primary key (Aid,email),
 foreign key (Aid) reference address on delete cascade,
  foreign key (email) reference users on delete cascade
);

create table Friend
(
user1 char(40),
user2 char(40),
 primary key (user1),
foreign key (user1) reference users on delete cascade,
  foreign key (user2) reference users on delete cascade
);

create table Event
(
Title char(40) not null,
Des char(300),
AID char(15),
Stime date,
dura char(20),
 primary key (Title),
foreign key (Aid) reference address,
);

create table POST
(
email char(40),
PID char(40),
Note char(300),
Plevel number(3,0),
pdate date,
 primary key (PID) not null,
foreign key (email) reference users on delete cascade,
);

create table POstc
(
email char(40),
PID char(40),
Text char(300),
cdate date,
foreign key (email) reference users on delete cascade,
foreign key (pid) reference post on delete cascade
);