DROP TABLE IF EXISTS Part;
DROP TABLE IF EXISTS Ordername;
DROP TABLE IF EXISTS Client;

CREATE TABLE Part
(
    id       int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    namepart VARCHAR(30) NOT NULL,
    vin      VARCHAR(40) NOT NULL,
    model    VARCHAR(20) NOT NULL,
    year     INTEGER
);

CREATE TABLE Ordername
(
    id          int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    numberorder VARCHAR(30) NOT NULL,
    statusorder BOOLEAN     NOT NULL
);

CREATE TABLE Client
(
    id        int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    username  VARCHAR(30) NOT NULL,
    firstname VARCHAR(30) NOT NULL,
    lastname  VARCHAR(30) NOT NULL,
    password  VARCHAR(50) NOT NULL,
    phone     VARCHAR(11) NOT NULL
);

-- PARTS:
INSERT INTO part(namepart, vin, model, year)
VALUES ('Magnitola', 'JH4CL96878C525510', 'Ford', 1988);
INSERT INTO part(namepart, vin, model, year)
VALUES ('Koleso', 'G6AE1RXXF0846207', 'Audi', 2011);
INSERT INTO part(namepart, vin, model, year)
VALUES ('Fara', 'WVWAA7AJ2CW263741', 'Jaguar', 1967);
INSERT INTO part(namepart, vin, model, year)
VALUES ('Motor', 'KNDMG4C71E6532505', 'Opel', 1999);
INSERT INTO part(namepart, vin, model, year)
VALUES ('Torpedo', 'WBADW3C56CE437448', 'Bmw', 2013);
INSERT INTO part(namepart, vin, model, year)
VALUES ('Zerkalo', 'YV1960ASXA1312354', 'Mercedes-Benz', 2019);
INSERT INTO part(namepart, vin, model, year)
VALUES ('Kapot', 'YV1960ASXA1322222', 'Saab', 1977);

-- Client:
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('gderbyshire0', 'Gabby', 'Derbyshire', 'ypgboX2cg', 4071589559);
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('lshepheard1', 'Lorne', 'Shepheard', 'JbWBczY', 4071589559);
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('efawdery2', 'Esra', 'Fawdery', 'ahmMbLCzBFM', 5798791883);
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('ralbiston3', 'Rusty', 'Albiston', 'bEsC8jbjYx', 5867919576);
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('esandwith4', 'Elyse', 'Sandwith', 'cUxfre', 6657239107);
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('dgeorge5', 'Dynah', 'George', 'WhAj0uTvqGH', 1732881398);
INSERT INTO client(username, firstname, lastname, password, phone)
VALUES ('ilinner6', 'Inesita', 'Linner', 'vBbl5JOgW', 1614234106);
