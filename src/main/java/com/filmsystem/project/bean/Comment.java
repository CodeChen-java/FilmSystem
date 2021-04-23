package com.filmsystem.project.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: CJ
 * @Date: 2021/4/4 17:36
 */
@Data
@ToString
public class Comment {
    private Integer commentId;
    private String commentText;
    private Date commentTime;
    private Integer userId;
    private Integer filmId;
}
