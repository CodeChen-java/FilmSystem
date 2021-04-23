package com.filmsystem.project.dao;

import com.filmsystem.project.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Author: CJ
 * @Date: 2021/4/6 10:28
 */
@Component(value = "adminDao")
public interface AdminDao {
    /**
     * 查询管理员表方法 登录
     */
    public Admin loginAdmin(@Param("adminName") String adminName,@Param("adminPwd")String adminPwd);
}
