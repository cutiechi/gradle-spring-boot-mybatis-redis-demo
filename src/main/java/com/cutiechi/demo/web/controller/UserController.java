package com.cutiechi.demo.web.controller;

import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
