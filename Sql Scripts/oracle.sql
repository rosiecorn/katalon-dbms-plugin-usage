CREATE TABLE tblActor (
  ActorID int  NOT NULL,
  ActorName varchar(255) NULL,
  ActorDOB  varchar(50) NULL,
  ActorGender varchar (255) NULL   
);

INSERT  ALL 
INTO  tblActor (ActorID,ActorName,ActorDOB,ActorGender) VALUES (1,'Tom Cruise','1962-07-03','Male')
INTO  tblActor (ActorID,ActorName,ActorDOB,ActorGender) VALUES (2,'Sam Neill','1947-09-14','Male')
INTO  tblActor (ActorID,ActorName,ActorDOB,ActorGender) VALUES (3,'Laura Dern','1967-02-10','Female')
INTO  tblActor (ActorID,ActorName,ActorDOB,ActorGender) VALUES (4,'Jeff Goldblum','1952-10-22','Male')

SELECT * FROM DUAL;

COMMIT;
