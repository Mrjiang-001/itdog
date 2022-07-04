package com.itdog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itdog.dao.UserInfoMapper;
import com.itdog.entity.UserInfo;
import com.itdog.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description: 用户管理实现类
 * @author: mhqf
 * @Date: 2022-07-02 18:41
 **/
@Service
public class UserServiceImpl  extends ServiceImpl<UserInfoMapper, UserInfo> implements UserService{

}
