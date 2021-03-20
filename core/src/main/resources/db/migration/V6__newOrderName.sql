DROP TABLE IF EXISTS Ordername;

CREATE TABLE Ordername
(
    id          int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    numberorder VARCHAR(30) NOT NULL,
    statusorder BOOLEAN     NOT NULL
);

-- ORDER:
INSERT INTO ordername (numberorder, statusorder)
VALUES ('32453325237', true);
INSERT INTO ordername (numberorder, statusorder)
VALUES ('35456564565', false);
INSERT INTO ordername (numberorder, statusorder)
VALUES ('76469654546', true);
INSERT INTO ordername (numberorder, statusorder)
VALUES ('96756546424', true);
INSERT INTO ordername (numberorder, statusorder)
VALUES ('11134466775', true);
INSERT INTO ordername (numberorder, statusorder)
VALUES ('21215668655', false);
INSERT INTO ordername (numberorder, statusorder)
VALUES ('11111367888', true);
