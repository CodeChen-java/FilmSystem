package com.filmsystem.project.service.Impl;

import com.filmsystem.project.bean.Film;
import com.filmsystem.project.dao.FilmDao;
import com.filmsystem.project.service.FilmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: CJ
 * @Date: 2021/4/7 23:00
 */
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmDao filmDao;

    @Override
    public void addFilm(Film film) {
        filmDao.addFilm(film);
    }

    @Override
    public void addIntroduction(String introduction,Integer id) {
        filmDao.addIntroduction(introduction,id);
    }

    @Override
    public PageInfo<Film> findFilmsByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Film> filmList = filmDao.getAllFilm();
        PageInfo<Film> pageInfo = new PageInfo<Film>(filmList);
        return pageInfo;
    }

    @Override
    public Film selectByName(String filmName) {
        return filmDao.selectByName(filmName);
    }

    @Override
    public Film selectById(Integer filmId) {
        return filmDao.selectById(filmId);
    }

    @Override
    public void updateFilm(Film film) {
        filmDao.updateFilm(film);
    }

    @Override
    public void deleteFilm(Integer id) {
        filmDao.deleteFilm(id);
    }


}
