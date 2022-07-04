package com.itdog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itdog.dao.UserInfoMapper;
import com.itdog.entity.UserInfo;
import com.itdog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserInfoMapper,UserInfo> implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
}
