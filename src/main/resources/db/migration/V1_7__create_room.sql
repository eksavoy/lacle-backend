CREATE TABLE ROOMS (
   ID  BIGSERIAL NOT NULL,
   NUMBER INT NOT NULL,
   PRIMARY KEY (ID)
);

ALTER TABLE IF EXISTS ROOMS ADD CONSTRAINT ROOM_NUMBER UNIQUE (NUMBER);