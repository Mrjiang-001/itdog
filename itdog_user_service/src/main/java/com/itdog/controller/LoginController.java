package com.itdog.controller;

import com.itdog.util.ApiResponse;
import com.itdog.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 登录控制器
 * @author: mhqf
 * @Date: 2022-07-02 00:33
 **/
@Api(tags = "登录权限模块")
@RestController
@RequestMapping(value = "/login")
public class LoginController {


    @ApiOperation(value = "登录接口")
    @PostMapping(value = "/login")
    public ApiResponse login( UserInfo userInfo,String flag ){
        return ApiResponse.failOfMessage("这里有个bug");
    }


}
