package com.cutiechi.demo.dao;

import com.cutiechi.demo.model.entity.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据访问接口
 *
 * @author Cutie Chi
 */
@Repository
public interface UserDao {

    /**
     * 获取全部顾客列表
     *
     * @return 全部顾客列表
     */
    @Select("select user_id, user_name, user_password, user_phone_number, user_gender, user_birth_date from user")
    List<User> listAll ();

    /**
     * 添加用户
     *
     * @param user 用户
     */
    @Insert("insert into user (user_name, user_password, user_phone_number, user_gender, user_birth_date) values (#{userName}, #{userPassword}, #{userPhoneNumber}, #{userGender}, #{userBirthDate})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    void insert (User user);

    /**
     * 修改用户
     *
     * @param user 用户
     */
    @Update("update user set user_name = #{userName}, user_password = #{userPassword}, user_phone_number = #{userPhoneNumber}, user_gender = #{userGender}, user_birth_date = #{userBirthDate} where user_id = #{userId}")
    void update (User user);

    /**
     * 根据用户 ID 获取用户
     *
     * @param userId 用户 ID
     * @return 用户
     */
    @Select("select user_id, user_name, user_password, user_phone_number, user_gender, user_birth_date from user where user_id = #{userId}")
    User getById (final Integer userId);
}
