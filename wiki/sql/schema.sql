create database qmusic_dev;
USE qmusic_dev;

/**
 * 用户表
 */
drop table if exists users;
create table users (
  id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
  username VARCHAR(50) not null COMMENT '用户登录名',
  password VARCHAR(500) not null COMMENT '用户登录密码',
  enabled boolean not null COMMENT '用户使用是否启用',
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
  )ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

drop table if exists authorities;
create table authorities (
  username VARCHAR(50) not null,
  authority VARCHAR(50) not null COMMENT '角色标识 ROLE_?',
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
  )ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

create unique index ix_auth_username on authorities (username,authority);