package com.cutiechi.demo.model.entity;

import com.cutiechi.demo.model.enumeration.UserGender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

import java.time.LocalDate;

/**
 * 用户实体类
 *
 * @author Cutie Chi
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public final class User implements Serializable {

    private static final long serialVersionUID = -496170348280590406L;
    /**
     * 用户 ID
     */
    private Integer userId;

    /**
     * 用户名称
     */
    @NonNull
    private String userName;

    /**
     * 用户密码
     */
    @NonNull
    private String userPassword;

    /**
     * 用户手机号码
     */
    @NonNull
    private String userPhoneNumber;

    /**
     * 用户性别, {@link UserGender}
     */
    private UserGender userGender;

    /**
     * 用户出生日期
     */
    private LocalDate userBirthDate;
}
