package com.itdog.controller;

import com.iddog.util.ApiResponse;
import com.itdog.entity.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 登录控制器
 * @author: mhqf
 * @Date: 2022-07-02 00:33
 **/
@RestController
@RequestMapping(value = "/login")
public class LoginController {


    @PostMapping(value = "/login")
    public ApiResponse login(UserInfo userInfo) {
        return ApiResponse.failOfMessage("这里有个bug");
    }


}
