package com.zero.apache.shiro.service;

import com.zero.apache.shiro.domain.entity.UserInfo;

public interface UserInfoService {

    UserInfo findByUsername(String username);
}