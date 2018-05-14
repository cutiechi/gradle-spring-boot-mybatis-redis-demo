package com.cutiechi.demo.model.enumeration;

/**
 * 用户性别枚举, Male 表示男, Female 表示女
 *
 * @author Cutie Chi
 */
public enum UserGender {

    Male("男"),
    Female("女");

    private final String userGender;

    UserGender (final String userGender) {
        this.userGender = userGender;
    }

    public String value () {
        return userGender;
    }
}
