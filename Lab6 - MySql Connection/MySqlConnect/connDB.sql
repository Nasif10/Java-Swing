create database connDB;
use conndb;


CREATE TABLE IF NOT EXISTS `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(50) NOT NULL,
  `student_dept` varchar(50) NOT NULL,
  `student_credit` double NOT NULL,
  PRIMARY KEY (`student_id`)
);



INSERT INTO `student` (`student_name`, `student_dept`, `student_credit`) VALUES
('ABC', 'CSE', 150.2),
('BCD', 'EEE', 160.5),
('CDE', 'EEE', 125.2)
