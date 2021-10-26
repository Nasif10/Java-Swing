CREATE DATABASE logindb;
USE logindb;

CREATE TABLE users (
id int NOT NULL AUTO_INCREMENT,
username varchar(50) NOT NULL,
email varchar(50) NOT NULL,
userpass varchar(50) NOT NULL,
PRIMARY KEY (id),
UNIQUE (username)
);

insert into users (username,email,userpass) values('Afridi','n@gmail.com','1234')