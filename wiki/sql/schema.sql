create database qmusic_dev;
USE qmusic_dev;

/**
 * 用户表
 */
drop table if exists q_user;
create table q_user (
  id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
  username VARCHAR(50) not null COMMENT '用户登录名',
  password VARCHAR(50) not null COMMENT '用户登录密码',
  enabled boolean not null COMMENT '用户使用是否启用',
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for group_members
-- ----------------------------
DROP TABLE IF EXISTS `q_user_role`;
CREATE TABLE `q_user_role` (
  id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
  `username` varchar(20) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;


drop table if exists q_permission;
create table q_permission (
  id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
  username VARCHAR(50) not null,
  permission VARCHAR(50) not null COMMENT '角色标识 ROLE_?',
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

create unique index ix_auth_username on authorities (username,authority);

-- ----------------------------
-- Table structure for groups
-- ----------------------------
DROP TABLE IF EXISTS q_role;
CREATE TABLE q_role (
  id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
  `name` varchar(50) DEFAULT NULL,
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for group_authorities
-- ----------------------------
DROP TABLE IF EXISTS `q_role_permission`;
CREATE TABLE `q_role_permission` (
  `role_id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `permission` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

