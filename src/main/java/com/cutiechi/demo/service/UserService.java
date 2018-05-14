package com.cutiechi.demo.service;

import com.cutiechi.demo.model.entity.User;

import java.util.List;

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

    /**
     * 获取全部顾客列表
     *
     * @return 全部顾客列表
     */
    List<User> listAll ();

    /**
     * 根据用户 ID 获取用户
     *
     * @param userId 用户 ID
     * @return 用户
     */
    User getById (final Integer userId);

    /**
     * 修改用户
     *
     * @param user 用户
     * @return 用户
     */
    User update (final User user);

    /**
     * 根据用户 ID 删除用户
     *
     * @param userId 用户 ID
     */
    void deleteById (final Integer userId);
}
