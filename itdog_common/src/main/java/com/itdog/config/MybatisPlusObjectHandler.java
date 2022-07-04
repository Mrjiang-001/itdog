package com.itdog.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @description: mybatis-plus
 * @author: mhqf
 * @Date: 2022-07-02 19:34
 **/
@Component
public class MybatisPlusObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        setFieldValByName("createDate", now.toString(), metaObject);//设置创建时间
        setFieldValByName("registerTime", now, metaObject);//设置注册时间
        setFieldValByName("status", 1, metaObject);//设置是否有效
        setFieldValByName("lock", 1, metaObject);//设置是否有效
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        setFieldValByName("modifyDate", now, metaObject);
    }
}
