package com.cutiechi.demo.web.controller;

import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 *
 * @author Cutie Chi
 */
@RequestMapping("/users")
@RestController
public class UserController {

    /**
     * 用户业务逻辑对象
     */
    private final UserService userService;

    /**
     * Spring 自动注入
     *
     * @param userService 用户业务逻辑对象
     */
    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 用户
     */
    @PostMapping("")
    public User insert (@RequestBody final User user) {
        return userService.insert(user);
    }

    /**
     * 获取全部顾客列表
     *
     * @return 全部顾客列表
     */
    @GetMapping("")
    public List<User> listAll () {
        return userService.listAll();
    }

    /**
     * 根据用户 ID 获取用户
     *
     * @param userId 用户 ID
     * @return 用户
     */
    @GetMapping("/{userId}")
    public User getById (@PathVariable final Integer userId) {
        return userService.getById(userId);
    }

    /**
     * 修改用户
     *
     * @param user 用户
     * @return 用户
     */
    @PutMapping("")
    public User update (@RequestBody User user) {
        return userService.update(user);
    }

    /**
     * 根据用户 ID 删除用户
     *
     * @param userId 用户 ID
     */
    @DeleteMapping("/{userId}")
    public void deleteById (@PathVariable final Integer userId) {
        userService.deleteById(userId);
    }
}
