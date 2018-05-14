package com.cutiechi.demo.service;

import com.cutiechi.demo.model.entity.User;

/**
 * 用户业务逻辑接口
 *
 * @author Cutie Chi
 */
public interface UserService {

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 用户
     */
    User insert (final User user);
}
