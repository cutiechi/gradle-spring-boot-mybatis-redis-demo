package com.cutiechi.demo.dao;

import com.cutiechi.demo.model.entity.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import org.springframework.stereotype.Repository;

/**
 * 用户数据访问接口
 *
 * @author Cutie Chi
 */
@Repository
public interface UserDao {

    /**
     * 添加用户
     *
     * @param user 用户
     */
    @Insert("insert into user (user_name, user_password, user_phone_number, user_gender, user_birth_date) values (#{userName}, #{userPassword}, #{userPhoneNumber}, #{userGender}, #{userBirthDate})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    void insert (User user);
}
