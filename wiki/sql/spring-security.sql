SELECT g.id, g.group_name, ga.authority FROM groups g, group_members gm, group_authorities ga
WHERE gm.username = 'fanhuajun' AND g.id = ga.group_id AND g.id = gm.group_id;