--创建数据库
CREATE DATABASE xc;
USE xc;

SET FOREIGN_KEY_CHECKS=0;
 
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) DEFAULT NULL COMMENT '用户名',
  `password` VARCHAR(100) DEFAULT NULL COMMENT '密码',
  `name` VARCHAR(100) DEFAULT NULL COMMENT '姓名',
  `age` INT(10) DEFAULT NULL COMMENT '年龄',
  `sex` TINYINT(1) DEFAULT NULL COMMENT '性别，1男性，2女性',
  `birthday` DATE DEFAULT NULL COMMENT '出生日期',
  `created` DATETIME DEFAULT NULL COMMENT '创建时间',
  `updated` DATETIME DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=INNODB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
 

INSERT INTO `user` VALUES ('1', 'zhangsan', '123456', '张三', '30', '1', '1984-08-08', '2014-09-19 16:56:04', '2014-09-21 11:24:59');
INSERT INTO `user` VALUES ('2', 'lisi', '123456', '李四', '21', '2', '1991-01-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');
INSERT INTO `user` VALUES ('3', 'wangwu', '123456', '王五', '22', '2', '1989-01-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');
INSERT INTO `user` VALUES ('4', 'zhangwei', '123456', '张伟', '20', '1', '1988-09-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');


SELECT * FROM USER 