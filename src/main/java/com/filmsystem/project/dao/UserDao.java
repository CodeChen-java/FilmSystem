package com.filmsystem.project.dao;

import com.filmsystem.project.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: CJ
 * @Date: 2021/4/6 10:10
 */
@Mapper
@Component(value = "userDao")
public interface UserDao  {
    /**
     * 查询用户方法
     */
    public User loginUser(@Param("userName") String username,@Param("password") String password);
    /**
     * 根据用户名查询方法 判断注册的用户是否已经存在
     */
    public int selectUserIdByName(@Param("userName") String userName);
    /**
     * 插入用户信息方法 用户注册
     */
    public void registerUser(User user);
    /**
     * 查询所有用户方法
     */
    public List<User> getAllUsers();

    /**
     * 删除用户信息
     * @param userId
     */
    public void deleteUser(@Param("userId") Integer userId);
}
