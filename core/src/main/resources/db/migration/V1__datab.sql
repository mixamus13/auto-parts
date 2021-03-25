DROP TABLE IF EXISTS Part;
DROP TABLE IF EXISTS OrderID;
DROP TABLE IF EXISTS Client;

CREATE TABLE Client
(
    id        BIGINT GENERATED ALWAYS AS IDENTITY NOT NULL,
    username  VARCHAR(255)                        NOT NULL,
    firstname VARCHAR(255)                        NOT NULL,
    lastname  VARCHAR(255)                        NOT NULL,
    password  VARCHAR(255)                        NOT NULL,
    phone     VARCHAR(255)                        NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE OrderID
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY NOT NULL,
    numberorder VARCHAR(255)                        NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Part
(
    id           BIGINT GENERATED ALWAYS AS IDENTITY NOT NULL,
    namepart     VARCHAR(255)                        NOT NULL,
    vin          VARCHAR(255)                        NOT NULL,
    model        VARCHAR(255)                        NOT NULL,
    year         INTEGER                             NOT NULL,
    availability BOOLEAN                             NOT NULL,
    PRIMARY KEY (id)
);


-- TABLE: client_order @OneToMany
CREATE TABLE client_orderid
(
    Client_id BIGINT NOT NULL,
    orderid_id  BIGINT NOT NULL
);

ALTER TABLE client_orderid
    ADD CONSTRAINT client_orderid__unique
        UNIQUE (orderid_id);


ALTER TABLE client_orderid
    ADD CONSTRAINT client_orderid__order_fk
        FOREIGN KEY (orderid_id) REFERENCES OrderID;

ALTER TABLE client_orderid
    ADD CONSTRAINT client_orderid__client_fk
        FOREIGN KEY (Client_id) REFERENCES Client;


-- TABLE: order_part @ManyToMany
CREATE TABLE orderid_part
(
    orderid_id BIGINT NOT NULL,
    part_id  BIGINT NOT NULL
);

ALTER TABLE OrderID
    ADD CONSTRAINT orderid__unique
        UNIQUE (numberorder);

ALTER TABLE orderid_part
    ADD CONSTRAINT orderid_part__part_fk
        FOREIGN KEY (part_id) REFERENCES Part;

ALTER TABLE orderid_part
    ADD CONSTRAINT orderid_part__orderid_fk
        FOREIGN KEY (orderid_id) REFERENCES OrderID;
