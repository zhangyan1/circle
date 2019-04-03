CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `app_type` int(11) NOT NULL,
  `scope_id` bigint(20) NOT NULL COMMENT '企业scopeId',
  `org_id` bigint(20) NOT NULL COMMENT '企业orgId',
  `content` varchar(1024) NOT NULL COMMENT '内容',
  `status` int(4) NOT NULL COMMENT '1-正常 0-删除',
  `create_user_id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `create_user_name` varchar(128) DEFAULT NULL COMMENT '名字',
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_scope_id` (`scope_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='用户表';