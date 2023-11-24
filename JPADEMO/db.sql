CREATE DATABASE IF NOT EXISTS `STUDENT_TRACKER`;
use student_tracker;
DROP TABLE IF EXISTS STUDENT;
create table student(
id int NOT NULL AUTO_INCREMENT,
first_name varchar(45) DEFAULT NULL,
last_name varchar(45) DEFAULT NULL,
email varchar(45) DEFAULT NULL,
PRIMARY KEY(id)
)