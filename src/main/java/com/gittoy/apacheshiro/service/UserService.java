package com.gittoy.apacheshiro.service;

import com.gittoy.apacheshiro.model.User;

/**
 * UserService
 * Create by GaoYu 2017/11/11 12:07
 */
public interface UserService {

    User findByUsername(String username);
}
