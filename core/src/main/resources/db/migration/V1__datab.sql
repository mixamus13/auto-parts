DROP TABLE IF EXISTS Part;
DROP TABLE IF EXISTS "Order";
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

CREATE TABLE "Order"
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
CREATE TABLE client_order
(
    Client_id BIGINT NOT NULL,
    order_id  BIGINT NOT NULL
);

ALTER TABLE client_order
    ADD CONSTRAINT client_order__unique
        UNIQUE (order_id);


ALTER TABLE client_order
    ADD CONSTRAINT client_order__order_fk
        FOREIGN KEY (order_id) REFERENCES "Order";

ALTER TABLE client_order
    ADD CONSTRAINT client_order__client_fk
        FOREIGN KEY (Client_id) REFERENCES Client;


-- TABLE: order_part @ManyToMany
CREATE TABLE order_part
(
    order_id BIGINT NOT NULL,
    part_id  BIGINT NOT NULL
);

ALTER TABLE "Order"
    ADD CONSTRAINT order__unique
        UNIQUE (numberorder);

ALTER TABLE order_part
    ADD CONSTRAINT order_part__part_fk
        FOREIGN KEY (part_id) REFERENCES Part;

ALTER TABLE order_part
    ADD CONSTRAINT order_part__order_fk
        FOREIGN KEY (order_id) REFERENCES "Order";
