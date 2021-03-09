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

-- USERS:
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (1, 'gderbyshire0', 'Gabby', 'Derbyshire', 'ypgboX2cg', 4071589559);
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (2, 'lshepheard1', 'Lorne', 'Shepheard', 'JbWBczY', 4071589559);
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (3, 'efawdery2', 'Esra', 'Fawdery', 'ahmMbLCzBFM', 5798791883);
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (4, 'ralbiston3', 'Rusty', 'Albiston', 'bEsC8jbjYx', 5867919576);
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (5, 'esandwith4', 'Elyse', 'Sandwith', 'cUxfre', 6657239107);
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (6, 'dgeorge5', 'Dynah', 'George', 'WhAj0uTvqGH', 1732881398);
INSERT INTO users(id, username, firstname, lastname, password, phone)
VALUES (7, 'ilinner6', 'Inesita', 'Linner', 'vBbl5JOgW', 1614234106);

-- ORDER:
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (1, '32453325237', true);
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (2, '35456564565', false);
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (3, '76469654546', true);
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (4, '96756546424', true);
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (5, '11134466775', true);
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (6, '21215668655', false);
INSERT INTO public.store (id, numberorder, statusorder)
VALUES (7, '11111367888', true);