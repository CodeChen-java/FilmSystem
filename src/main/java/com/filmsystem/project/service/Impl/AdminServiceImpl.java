package com.filmsystem.project.service.Impl;

import com.filmsystem.project.bean.Admin;
import com.filmsystem.project.dao.AdminDao;
import com.filmsystem.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: CJ
 * @Date: 2021/4/6 10:31
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin loginAdmin(String adminName, String adminPwd) {
        return adminDao.loginAdmin(adminName, adminPwd);
    }
}
