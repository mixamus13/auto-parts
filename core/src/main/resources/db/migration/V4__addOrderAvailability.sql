DROP TABLE IF EXISTS Part;

CREATE TABLE Part
(
    id           int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    namepart     VARCHAR(30) NOT NULL,
    vin          VARCHAR(40) NOT NULL,
    model        VARCHAR(20) NOT NULL,
    year         INTEGER     NOT NULL,
    availability BOOLEAN     NOT NULL
);

-- PARTS:
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Magnitola', 'JH4CL96878C525510', 'Ford', 1988, true);
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Koleso', 'G6AE1RXXF0846207', 'Audi', 2011, false);
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Fara', 'WVWAA7AJ2CW263741', 'Jaguar', 1967, true);
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Motor', 'KNDMG4C71E6532505', 'Opel', 1999, true);
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Torpedo', 'WBADW3C56CE437448', 'Bmw', 2013, true);
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Zerkalo', 'YV1960ASXA1312354', 'Mercedes-Benz', 2019, true);
INSERT INTO part(namepart, vin, model, year, availability)
VALUES ('Kapot', 'YV1960ASXA1322222', 'Saab', 1977, false);
