package com.filmsystem.project.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: CJ
 * @Date: 2021/4/4 17:38
 */
@ToString
@Data
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String userGender;
    private String userPhone;
}
