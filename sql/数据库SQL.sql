CREATE TABLE `user_info`  (
        `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
        `user_cname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称（微信名称）',
        `mobile_phone` bigint(0) NULL DEFAULT NULL COMMENT '用户手机号',
        `age` int(0) NULL DEFAULT NULL COMMENT '用户年龄',
        `id_card` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
        `user_introduce` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户个人介绍',
        `wechat_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户微信Id',
        `alipay_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付宝ID',
        `user_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
        `lock` tinyint(0) NULL DEFAULT NULL COMMENT '是否锁定',
        `status` tinyint(0) NULL DEFAULT NULL COMMENT '是否有效',
        `register_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '注册时间',
        `modify_pwd_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改密码时间',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
