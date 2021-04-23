package com.filmsystem.project.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: CJ
 * @Date: 2021/4/4 17:37
 */
@ToString
@Data
public class Film {

    private Integer filmId;
    private String filmName;
    private Double filmScore;
    private String filmComment;
    private String introduction;
    private Integer year;
}
