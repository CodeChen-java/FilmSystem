package com.filmsystem.project.controller;

import com.filmsystem.project.bean.User;
import com.filmsystem.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

/**
 * 处理用户登录请求的控制层
 * @Author: CJ
 * @Date: 2021/4/7 22:41
 */
@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("/userRegister")
    public String userRegister(User user, HttpSession session, Model model) {
        //先判断用户名是否已经注册
        String username = user.getUserName();
        int count = userService.selectUserIdByName(username);
        if(count==0) {
            //没有注册 调用方法进行注册
            userService.registerUser(user);
            //跳转到登录界面
            return "login";
        }else {
            //用户已经注册 提示信息
            model.addAttribute("registerMsg","用户名已经存在");
            return "register";
        }
    }
}
