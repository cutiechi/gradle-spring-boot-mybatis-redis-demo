package com.cutiechi.demo.service.impl;

import com.cutiechi.demo.dao.UserDao;
import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务逻辑实现类
 *
 * @author Cutie Chi
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 用户数据访问接口对象
     */
    private final UserDao userDao;

    /**
     * Spring 自动注入
     *
     * @param userDao 用户数据访问接口对象
     */
    @Autowired
    public UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 用户
     */
    @CachePut(cacheNames = "user", key = "#user.userId")
    @Override
    public User insert (final User user) {
        userDao.insert(user);
        return user;
    }

    /**
     * 获取全部顾客列表
     *
     * @return 全部顾客列表
     */
    @Override
    public List<User> listAll () {
        return userDao.listAll();
    }

    /**
     * 根据用户 ID 获取用户
     *
     * @param userId 用户 ID
     * @return 用户
     */
    @Cacheable(cacheNames = "user", key = "#userId")
    @Override
    public User getById (Integer userId) {
        return userDao.getById(userId);
    }

    /**
     * 修改用户
     *
     * @param user 用户
     * @return 用户
     */
    @CachePut(cacheNames = "user", key = "#user.userId")
    @Override
    public User update (User user) {
        userDao.update(user);
        return user;
    }

    /**
     * 根据用户 ID 删除用户
     *
     * @param userId 用户 ID
     */
    @CacheEvict(cacheNames = "user", key = "#userId")
    @Override
    public void deleteById (Integer userId) {
        userDao.deleteById(userId);
    }
}
