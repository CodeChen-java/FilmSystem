package com.filmsystem.project.service;

import com.filmsystem.project.bean.Film;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: CJ
 * @Date: 2021/4/7 22:59
 */
@Component(value = "filmService")
public interface FilmService {
    public void addFilm(Film film);
    public void addIntroduction(String introduction,Integer id);
    //分页查询
    public PageInfo<Film> findFilmsByPage(int pageNum, int pageSize);
    public Film selectByName(String filmName);
    public Film selectById(Integer filmId);
    public void updateFilm(Film film);
    public void deleteFilm(Integer id);
}
