package com.zizi.qmusic.server.common;

public class SqlConstant {

    /**
     * 查询用户权限sql
     * 原始sql
     * SELECT g.id, g.group_name, ga.authority
     * FROM groups g, group_members gm, group_authorities ga
     * WHERE gm.username = 'fanhuajun' AND g.id = ga.group_id AND g.id = gm.group_id
     */
    final static String groupAuthoritiesByUsernameQuery =
            "SELECT t1.id, t1.name, t3.permission\n" +
                    "FROM q_role t1, q_user_role t2, q_role_permission t3\n" +
                    "WHERE t2.username = ? AND t1.id = t3.role_id AND t1.id = t2.role_id";

    final static String usersByUsernameQuery =
            "select username,password,enabled \n" +
                    "from q_user " + "where username = ?";


}
