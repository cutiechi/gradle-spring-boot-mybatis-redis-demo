package com.cutiechi.demo.dao;

import com.cutiechi.demo.ApplicationTests;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户数据接口测试类
 *
 * @author Cutie Chi
 */
class UserDaoTests extends ApplicationTests {

    /**
     * Spring 自动注入用户数据接口对象
     */
    @Autowired
    private UserDao userDao;
}
