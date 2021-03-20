-- auto-generated definition
drop table if exists part;
create table part
(
    id           integer generated always as identity
        constraint part_pkey
            primary key
        constraint part_id_fkey
            references ordername
        constraint part_id_fkey1
            references ordername,
    namepart     varchar(30) not null,
    vin          varchar(40) not null,
    model        varchar(20) not null,
    year         integer     not null,
    availability boolean     not null
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

-- alter table part
--     owner to postgres;
--
