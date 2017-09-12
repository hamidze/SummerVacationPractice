create database spring_data;

create table student(
  id int not null auto_increment,
  name varchar(20) not null,
  age int not null,
  PRIMARY KEY (id)
);

insert into student (name, age) values ("test1",20);
insert into student (name, age) values ("test2",21);
insert into student (name, age) values ("test3",22);
insert into student (name, age) values ("test4",20);
insert into student (name, age) values ("test5",21);
insert into student (name, age) values ("test6",22);
insert into student (name, age) values ("test16",22);