package com.filmsystem.project.controller;

import com.filmsystem.project.bean.Film;
import com.filmsystem.project.service.FilmService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 处理对电影的增删改查的控制器
 * @Author: CJ
 * @Date: 2021/4/8 9:32
 */

@CrossOrigin
@RestController
public class FilmController {
    @Autowired
    private FilmService filmService;

    /**
     * 添加电影
     * @param film
     * @return
     */
    @PostMapping("/addFilm")
    public String addFilm(@RequestBody Film film) {
        String filmName = film.getFilmName();
        Film selectFilm = filmService.selectByName(filmName);
        if(selectFilm==null) {
            filmService.addFilm(film);
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 获取所有电影
     */
    @ResponseBody
    @GetMapping("/getAllFilms/{pageNum}/{size}")
    public PageInfo<Film> getAllFilms(@PathVariable("pageNum")Integer page
            , @PathVariable("size") Integer size) {
        PageInfo<Film> filmList = filmService.findFilmsByPage(page,size);
        return filmList;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping("/getFilmById/{id}")
    public Film getFilmById(@PathVariable("id") Integer id){
        Film film = filmService.selectById(id);
        return film;
    }

    /**
     * 更新方法
     * @param film
     * @return
     */
    @ResponseBody
    @PutMapping("/updateFilm")
    public String updateFilm(@RequestBody Film film) {
        filmService.updateFilm(film);
        return "success";
    }

    @ResponseBody
    @DeleteMapping("/deleteFilm/{id}")
    public String delete(@PathVariable("id") Integer id) {
        filmService.deleteFilm(id);
        return "success";
    }
}
