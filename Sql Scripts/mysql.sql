CREATE DATABASE `Movies` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE Movies;

CREATE TABLE `tblActor` (
  `ActorID` int (9) NOT NULL,
  `ActorName` varchar(255) NULL,
  `ActorDOB`  varchar(50) NULL,
  `ActorGender` varchar (255) NULL   
);

INSERT INTO  `tblActor` (`ActorID`,`ActorName`,`ActorDOB`,`ActorGender`)
VALUES (1,'Tom Cruise','1962-07-03','Male')
, (2,'Sam Neill','1947-09-14','Male')
, (3,'Laura Dern','1967-02-10','Female')
, (4,'Jeff Goldblum','1952-10-22','Male')


