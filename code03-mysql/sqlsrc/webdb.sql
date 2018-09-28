CREATE DATABASE webdb;
USE webdb;
CREATE TABLE webdb(
	uid INT PRIMARY KEY AUTO_INCREMENT,
	u_username VARCHAR(20) NOT NULL,
	u_password VARCHAR(20) NOT NULL,
	gender VARCHAR(6),
	telNum VARCHAR(20),	
	email VARCHAR(35)
);
