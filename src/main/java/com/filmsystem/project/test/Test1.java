package com.filmsystem.project.test;

import com.filmsystem.project.bean.Film;
import com.filmsystem.project.service.FilmService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: CJ
 * @Date: 2021/4/9 23:47
 */
@SpringBootTest
public class Test1 {
    @Autowired
    private FilmService filmService;
    @Test
    public void test() {
//        Film film = new Film();
//        film.setFilmName("不能说的秘密");
//        film.setIntroduction("关于爱情的电影");
//        film.setYear(2007);
//        filmService.addFilm(film);
        System.out.println(filmService);
    }
}
