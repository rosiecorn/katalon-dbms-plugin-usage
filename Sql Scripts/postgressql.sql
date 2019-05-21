
CREATE DATABASE movies;
\connect movies

-- create table tblactor
CREATE TABLE tblactor
(
    actorid integer NOT NULL,
    actorname character varying(255),
    actordob date,
    actorgender character varying(255),
)

-- insert data to tblactor

INSERT INTO public.tblactor(actorid, actorname, actordob, actorgender) VALUES (1, 'Tom cruise', '1962-07-03', 'Male'),(2, 'sam neill', '1947-09-14', 'Male'),(3, 'laura dern', '1967-02-10', 'female'),(4, 'Jeff goldblum', '1952-10-22', 'Male')

--create table tblfilm
CREATE TABLE public.tblfilm
(
    filmid integer NOT NULL,
    filmname character varying(255),
    filmreleasedate date,
    filmdirectorid integer,
    filmlanguageid integer,
    filmcountryid integer,
    filmstudioid integer,
    filmsynopsis character varying,
    filmruntimeminutes integer,
    filmcertificateid bigint,
    filmbudgetdollars integer,
    filmboxofficedollars integer,
    filmoscarnominations integer,
    filmoscarwins integer
)


--insert data to tblfilm

INSERT INTO public.tblfilm(filmid, filmname, filmreleasedate, filmdirectorid, filmlanguageid, filmcountryid, filmstudioid, filmsynopsis, filmruntimeminutes, filmcertificateid, filmbudgetdollars, filmboxofficedollars, filmoscarnominations, filmoscarwins) VALUES (1, 'Jurassic Park', '1993-07-16', 4, 1, 241, 1, 'scientists clone dinosaurs to populate a theme park which suffers a major security breakdown and releases the dinosaurs.', 127, 2, 63000000, 920100000, 3, 3),(2, 'spider-Man', '2002-06-14', 11, 1, 241, 5, 'When bitten by a genetically modified spider, a nerdy, shy, and awkward high school student gains spider-like abilities that he eventually must use to fight evil as a superhero after tragedy befalls his family.', 121, 4, 139000000, 821606375, 2, 0),(3, 'King Kong', '2005-12-15', 12, 1, 241, 1, 'In 1933 new York, an overly ambitious movie producer coerces his cast and hired ship crew to travel to mysterious skull Island, where they encounter Kong, a giant ape who is immediately smitten with leading lady ann darrow.', 187, 4, 207000000, 550316796, 4, 3),(4, 'superman returns', '2006-07-16', 14, 1, 241, 6, 'after a long visit to the lost remains of the planet Krypton, the Man of steel returns to earth to become the peoples savior once again and reclaim the love of lois lane.', 154, 4, 204000000, 391120000, 1, 0)