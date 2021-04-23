package com.filmsystem.project.service.Impl;

import com.filmsystem.project.bean.Film;
import com.filmsystem.project.bean.User;
import com.filmsystem.project.dao.UserDao;
import com.filmsystem.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: CJ
 * @Date: 2021/4/6 10:15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User loginUser(String userName, String password) {
        return userDao.loginUser(userName,password);
    }

    @Override
    public int selectUserIdByName(String userName) {
        return userDao.selectUserIdByName(userName);
    }

    @Override
    public void registerUser(User user) {
        userDao.registerUser(user);
    }

    @Override
    public PageInfo<User> getAllUsers(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userDao.getAllUsers();
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        return pageInfo;
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }
}
