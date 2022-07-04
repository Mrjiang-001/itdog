package com.itdog.controller;

import com.itdog.util.ApiResponse;
import com.itdog.entity.UserInfo;
import com.itdog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * @description: 用户控制层
 * @author: mhqf
 * @Date: 2022-07-02 00:33
 **/

@Api(tags = "用户管理模块")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/save")
    public ApiResponse save(UserInfo userInfo) {
        userInfo.setRegisterTime(new Timestamp(System.currentTimeMillis()));
        userService.saveOrUpdate(userInfo);
        return ApiResponse.failOfMessage("sss");
    }
}
