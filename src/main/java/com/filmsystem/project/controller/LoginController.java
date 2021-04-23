package com.filmsystem.project.controller;

import com.filmsystem.project.bean.Admin;
import com.filmsystem.project.bean.User;
import com.filmsystem.project.service.AdminService;
import com.filmsystem.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

/**
 * @Author: CJ
 * @Date: 2021/4/5 22:24
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @GetMapping(value={"/","/main.html"})
    public String main(Model model) {
        model.addAttribute("login_link","localhost:8080/login");
        model.addAttribute("register_link","localhost:8080/register");
        model.addAttribute("adminLogin","localhost:8080/toAdminLogin");
        return "main";
    }

    /**
     * 去用户登录
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 去管理员登录界面
     */
    @GetMapping("/toAdminLogin")
    public String toAdminLogin() {
        return "adminLogin";
    }
    /**
     * 去管理员主界面
     */
    @GetMapping("/adminMain.html")
    public String adminMain() {
        return "adminMain";
    }
    /**
     * 处理用户登录
     * @param user
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/userLogin")
    public String userLogin(User user,HttpSession session,Model model) {
        String username = user.getUserName();
        String password = user.getPassword();
        System.out.println(username);
        System.out.println(password);
        User loginUser = userService.loginUser(username, password);
        if(loginUser!=null) {
            session.setAttribute("loginUser",loginUser);
            //登录成功 去主界面
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }

    /**
     *  处理管理员登录
     * @param admin
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/adminLogin")
    public String adminLogin(Admin admin,HttpSession session,Model model) {
        String adminName = admin.getAdminName();
        String adminPwd = admin.getAdminPwd();
        Admin loginAdmin = adminService.loginAdmin(adminName, adminPwd);
        if(loginAdmin!=null) {
            //登录成功 去管理员主界面
            session.setAttribute("loginAdmin",loginAdmin);
            return "redirect:/adminMain.html";
        }else {
            //登录失败 提示信息 重回登录界面
            model.addAttribute("msg","账号密码错误");
            return "adminLogin";
        }
    }
}
