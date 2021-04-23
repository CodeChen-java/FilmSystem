package com.filmsystem.project.dao;

import com.filmsystem.project.bean.Film;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 处理对电影类的增删改查
 * @Author: CJ
 * @Date: 2021/4/7 22:57
 */
@Component(value = "filmDao")
public interface FilmDao {
    /**
     * 增加电影方法
     * @param film
     */
    public void addFilm(Film film);

    /**
     * 管理员添加简介方法
     */
    public void addIntroduction(@Param("introduction") String introduction,@Param("id") Integer id);

    /**
     * 查询所有电影
     * @return
     */
    public List<Film> getAllFilm();

    /**
     * 根据电影名查询 判断是否有数据
     * @param filmName
     * @return
     */
    public Film selectByName(@Param("filmName") String filmName);

    /**
     * 根据id查 用于修改时数据回显
     * @param filmId
     * @return
     */
    public Film selectById(@Param("filmId") Integer filmId);

    public void updateFilm(Film film);

    public void deleteFilm(@Param("filmId") Integer filmId);
}
