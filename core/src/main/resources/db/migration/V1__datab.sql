DROP TABLE IF EXISTS Part;
DROP TABLE IF EXISTS Orders;
DROP TABLE IF EXISTS Client;

CREATE TABLE Part
(
    id           int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    namepart     varchar(30) not null,
    vin          varchar(40) not null,
    model        varchar(20) not null,
    year         integer     not null,
    availability boolean     not null
);

CREATE TABLE Orders
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