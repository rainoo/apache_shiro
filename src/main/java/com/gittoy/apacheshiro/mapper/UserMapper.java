package com.gittoy.apacheshiro.mapper;

import com.gittoy.apacheshiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper
 * Create by GaoYu 2017/11/11 12:05
 */
public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
