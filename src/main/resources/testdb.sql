-- Database: testdb

-- DROP DATABASE testdb;

CREATE DATABASE testdb
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.UTF-8'
       LC_CTYPE = 'en_US.UTF-8'
       CONNECTION LIMIT = -1;


-- Table: members

-- DROP TABLE members;

CREATE TABLE members
(
  id bigint NOT NULL,
  first character varying(128),
  middle character varying(128),
  last character varying(128),
  CONSTRAINT "member-pk" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE members
  OWNER TO postgres;

INSERT INTO members(
            id, first, middle, last)
    VALUES (1, 'Cory', 'L', 'Wandling');

INSERT INTO phone_numbers(
            id, "number", member_id)
    VALUES (1, '515.451.3671', 1);

INSERT INTO phone_numbers(
            id, "number", member_id)
    VALUES (2, '515.451.1075', 1);







-- Table: phone_numbers

-- DROP TABLE phone_numbers;

CREATE TABLE phone_numbers
(
  id bigint NOT NULL,
  "number" character varying(32),
  member_id bigint,
  CONSTRAINT "phone_numbers-pk" PRIMARY KEY (id),
  CONSTRAINT "phone_number-member-fk" FOREIGN KEY (member_id)
      REFERENCES members (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE phone_numbers
  OWNER TO postgres;

