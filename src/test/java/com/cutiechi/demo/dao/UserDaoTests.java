package com.cutiechi.demo.dao;

import com.cutiechi.demo.ApplicationTests;
import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.model.enumeration.UserGender;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

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

    /**
     * 测试添加用户
     */
    @Test
    void testInsert () {
        User user = new User("super", "123456", "18845679876");
        userDao.insert(user);
        System.out.println(user);
    }

    /**
     * 测试获取全部用户列表
     */
    @Test
    void testListAll () {
        userDao.listAll().forEach(System.out::println);
    }

    /**
     * 测试修改用户
     */
    @Test
    void testUpdate () {
        User user = new User("super", "123456", "18845679876");
        user.setUserId(1);
        user.setUserGender(UserGender.Male);
        user.setUserBirthDate(LocalDate.now());
        userDao.update(user);
    }
}
