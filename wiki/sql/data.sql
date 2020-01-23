INSERT INTO q_user (id, username, password, enabled) VALUES (1, 'fanhuajun', '1', 1);
INSERT INTO q_role (id, name) VALUES (1, 'admin');
INSERT INTO q_permission (id, username, permission) VALUES (1, 'fanhuajun', 'admin');
INSERT INTO q_role_permission (role_id, permission) VALUES (1, 'admin');
INSERT INTO q_user_role (id, username, role_id) VALUES (10000, 'fanhuajun', 1);
