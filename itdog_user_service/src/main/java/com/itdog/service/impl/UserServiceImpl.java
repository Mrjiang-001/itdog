package com.itdog.service.impl;

import com.itdog.dao.UserInfoMapper;
import com.itdog.entity.UserInfo;
import com.itdog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserInfoMapper userInfoMapper;
    
    @Override
    public void save(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }
}
