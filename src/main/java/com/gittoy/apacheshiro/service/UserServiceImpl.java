package com.gittoy.apacheshiro.service;

import com.gittoy.apacheshiro.mapper.UserMapper;
import com.gittoy.apacheshiro.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserServiceImpl
 * Create by GaoYu 2017/11/11 12:13
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
