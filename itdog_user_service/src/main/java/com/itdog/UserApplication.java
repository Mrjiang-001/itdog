package com.itdog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 主启动类
 * @author: mhqf
 * @Date: 2022-07-02 00:32
 **/
@SpringBootApplication
//@MapperScan("com.itdog.dao.*")
@MapperScan("com.itdog.dao")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
