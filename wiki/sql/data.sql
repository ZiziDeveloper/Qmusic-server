INSERT INTO users (username, password, enabled) VALUES ('fanhuajun', '1', 1);
INSERT INTO users (username, password, enabled) VALUES ('fanhuajun2', '1', 1);

INSERT INTO authorities (username, authority) VALUES ('fanhuajun', 'ROLE_user');
INSERT INTO authorities (username, authority) VALUES ('fanhuajun2', 'ROLE_admin');
