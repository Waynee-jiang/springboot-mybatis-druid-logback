/*
Navicat MySQL Data Transfer

Source Server         : localhost_mysql
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-06-05 22:52:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_area
-- ----------------------------
DROP TABLE IF EXISTS `sys_area`;
CREATE TABLE `sys_area` (
  `admin_code` varchar(12) NOT NULL COMMENT '行政编码',
  `admin_name` varchar(16) NOT NULL COMMENT '行政名称',
  `parent_code` varchar(12) DEFAULT NULL COMMENT '父行政区编号：省级行政上级视为-1',
  `admin_level` int(2) DEFAULT NULL COMMENT '行政级别：省级为5，行政级别向下，级别递减'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_area
-- ----------------------------
INSERT INTO `sys_area` VALUES ('330000', '浙江省', '-1', '5');
INSERT INTO `sys_area` VALUES ('330100', '杭州市', '330000', '4');
INSERT INTO `sys_area` VALUES ('330101', '市辖区', '330100', '3');
INSERT INTO `sys_area` VALUES ('330102', '上城区', '330100', '3');
INSERT INTO `sys_area` VALUES ('330102001000', '清波街道', '330102', '2');
INSERT INTO `sys_area` VALUES ('330102001051', '清波门社区', '330102001000', '1');
INSERT INTO `sys_area` VALUES ('330102001052', '劳动路社区', '330102001000', '1');
INSERT INTO `sys_area` VALUES ('330102001053', '定安路社区', '330102001000', '1');
INSERT INTO `sys_area` VALUES ('330102001055', '清河坊社区', '330102001000', '1');
INSERT INTO `sys_area` VALUES ('330102001057', '柳翠井巷社区', '330102001000', '1');
INSERT INTO `sys_area` VALUES ('330102003000', '湖滨街道', '330102', '2');
INSERT INTO `sys_area` VALUES ('330102003050', '涌金门社区', '330102003000', '1');
INSERT INTO `sys_area` VALUES ('330102003052', '青年路社区', '330102003000', '1');
INSERT INTO `sys_area` VALUES ('330102003053', '东平巷社区', '330102003000', '1');
INSERT INTO `sys_area` VALUES ('330102003055', '岳王路社区', '330102003000', '1');
INSERT INTO `sys_area` VALUES ('330102003057', '东坡路社区', '330102003000', '1');
INSERT INTO `sys_area` VALUES ('330102003058', '吴山路社区', '330102003000', '1');