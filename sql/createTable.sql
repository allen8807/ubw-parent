CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE `biz_kv` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
  `gmt_create` bigint(20) DEFAULT NULL COMMENT 'created time',
  `gmt_update` bigint(20) DEFAULT NULL COMMENT 'update time',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  `key` varchar(45) NOT NULL COMMENT 'key name',
  `value_int` int(11) DEFAULT NULL COMMENT 'integer value of the item ',
  `value_str` varchar(45) DEFAULT NULL COMMENT 'string value of the item',
  PRIMARY KEY (`id`),
  UNIQUE KEY `item_UNIQUE` (`key`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='business key-value table';

