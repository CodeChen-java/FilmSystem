package com.filmsystem.project.service;

import com.filmsystem.project.bean.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: CJ
 * @Date: 2021/4/6 10:14
 */

public interface UserService {
    /**
     * 查询用户方法
     */
    public User loginUser(String userName,String password);
    /**
     * 根据用户名查询信息方法
     */
    public int selectUserIdByName(String userName);
    /**
     * 注册方法
     */
    public void registerUser(User user);
    /**
     * 查询所有用户方法
     */
    public PageInfo<User> getAllUsers(int pageNum,int pageSize);

    /**
     * 删除用户信息
     * @param id
     */
    public void deleteUser(Integer id);
}
