DROP TABLE IF EXISTS Part;
DROP TABLE IF EXISTS Store;
DROP TABLE IF EXISTS Users;

CREATE TABLE Part
(
    id       INTEGER     NOT NULL PRIMARY KEY,
    namePart VARCHAR(30) NOT NULL,
    vin      VARCHAR(40) NOT NULL,
    model    VARCHAR(20) NOT NULL,
    year     INTEGER
);

CREATE TABLE Store
(
    id          INTEGER     NOT NULL PRIMARY KEY,
    numberOrder VARCHAR(30) NOT NULL,
    statusOrder BOOLEAN NOT NULL
);

CREATE TABLE Users
(
    id        INTEGER     NOT NULL PRIMARY KEY,
    userName  VARCHAR(30) NOT NULL,
    firstName VARCHAR(30) NOT NULL,
    lastName  VARCHAR(30) NOT NULL,
    password  VARCHAR(50) NOT NULL,
    phone     VARCHAR(11) NOT NULL
);