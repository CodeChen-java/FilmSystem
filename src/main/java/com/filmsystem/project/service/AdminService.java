package com.filmsystem.project.service;

import com.filmsystem.project.bean.Admin;
import org.springframework.stereotype.Component;

/**
 * @Author: CJ
 * @Date: 2021/4/6 10:31
 */
@Component(value = "adminService")
public interface AdminService {
    public Admin loginAdmin(String adminName,String adminPwd);
}
