package com.zero.apache.shiro.common.repository;

import com.zero.apache.shiro.domain.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {

    UserInfo findByUsername(String username);
}