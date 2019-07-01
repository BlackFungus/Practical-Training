/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : db_bbs

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-06-28 17:31:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for td_chat_friend
-- ----------------------------
DROP TABLE IF EXISTS `td_chat_friend`;
CREATE TABLE `td_chat_friend` (
  `sid` int(10) NOT NULL,
  `friends_sid` text COLLATE utf8_general_mysql500_ci,
  `blacklist_sid` text COLLATE utf8_general_mysql500_ci,
  PRIMARY KEY (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_chat_friend
-- ----------------------------

-- ----------------------------
-- Table structure for td_chat_message
-- ----------------------------
DROP TABLE IF EXISTS `td_chat_message`;
CREATE TABLE `td_chat_message` (
  `mid` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `message` text COLLATE utf8_general_mysql500_ci NOT NULL,
  `from` int(10) NOT NULL COMMENT '发送方的学号',
  `to` int(10) NOT NULL COMMENT '接收方的学号',
  `read` int(11) NOT NULL DEFAULT '1' COMMENT '0代表已读 1代表未读',
  `time` datetime NOT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_chat_message
-- ----------------------------

-- ----------------------------
-- Table structure for td_topic_mian
-- ----------------------------
DROP TABLE IF EXISTS `td_topic_mian`;
CREATE TABLE `td_topic_mian` (
  `tid` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `sid` int(10) NOT NULL,
  `title` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `context` tinytext COLLATE utf8_general_mysql500_ci NOT NULL,
  `file` text COLLATE utf8_general_mysql500_ci,
  `create_time` datetime NOT NULL,
  `change_time` datetime NOT NULL,
  `state` int(11) NOT NULL DEFAULT '1' COMMENT '0冻结 1正常 2置顶',
  PRIMARY KEY (`tid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_topic_mian
-- ----------------------------

-- ----------------------------
-- Table structure for td_topic_reply
-- ----------------------------
DROP TABLE IF EXISTS `td_topic_reply`;
CREATE TABLE `td_topic_reply` (
  `rid` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `sid` varchar(10) COLLATE utf8_general_mysql500_ci NOT NULL,
  `tid` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `context` text COLLATE utf8_general_mysql500_ci NOT NULL,
  `file` text COLLATE utf8_general_mysql500_ci,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_topic_reply
-- ----------------------------

-- ----------------------------
-- Table structure for td_user_basic
-- ----------------------------
DROP TABLE IF EXISTS `td_user_basic`;
CREATE TABLE `td_user_basic` (
  `sid` int(10) NOT NULL,
  `username` varchar(25) COLLATE utf8_general_mysql500_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `headSculpture` varchar(60) COLLATE utf8_general_mysql500_ci NOT NULL,
  `introduction` text COLLATE utf8_general_mysql500_ci,
  `create_time` datetime NOT NULL,
  `identity` int(11) NOT NULL DEFAULT '1' COMMENT '1表示普通用户 2表示管理员',
  `state` int(11) NOT NULL DEFAULT '1' COMMENT '0冻结，1激活',
  PRIMARY KEY (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_user_basic
-- ----------------------------

-- ----------------------------
-- Table structure for td_user_personaldata
-- ----------------------------
DROP TABLE IF EXISTS `td_user_personaldata`;
CREATE TABLE `td_user_personaldata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) COLLATE utf8_general_mysql500_ci NOT NULL,
  `sid` int(10) NOT NULL,
  `nativePlace` varchar(30) COLLATE utf8_general_mysql500_ci NOT NULL,
  `ID_No` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `phoneNum` int(11) NOT NULL,
  `class` varchar(10) COLLATE utf8_general_mysql500_ci NOT NULL,
  `QQNum` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_user_personaldata
-- ----------------------------

-- ----------------------------
-- Table structure for td_user_sys
-- ----------------------------
DROP TABLE IF EXISTS `td_user_sys`;
CREATE TABLE `td_user_sys` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(10) NOT NULL,
  `username` varchar(25) COLLATE utf8_general_mysql500_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `create_time` datetime NOT NULL,
  `headSculpture` varchar(60) COLLATE utf8_general_mysql500_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Records of td_user_sys
-- ----------------------------
