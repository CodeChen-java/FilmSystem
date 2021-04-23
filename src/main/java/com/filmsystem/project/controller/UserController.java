package com.filmsystem.project.controller;

import com.filmsystem.project.bean.User;
import com.filmsystem.project.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: CJ
 * @Date: 2021/4/10 13:12
 */
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers/{pageNum}/{size}")
    public PageInfo<User> getAllUsers(@PathVariable("pageNum") Integer pageNum,
                                      @PathVariable("size") Integer size) {
        PageInfo<User> pageInfo = userService.getAllUsers(pageNum,size);
        return pageInfo;
    }

    /**
     * 删除用户请求
     */
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return "success";
    }
}
