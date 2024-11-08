package com.zero.apache.shiro.service.impl;

import com.zero.apache.shiro.common.repository.UserInfoDao;
import com.zero.apache.shiro.domain.entity.UserInfo;
import com.zero.apache.shiro.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }

}