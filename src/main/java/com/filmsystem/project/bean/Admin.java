package com.filmsystem.project.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: CJ
 * @Date: 2021/4/4 17:35
 */
@Data
@ToString
public class Admin {
    private Integer adminId;
    private String adminName;
    private String adminPwd;
}
