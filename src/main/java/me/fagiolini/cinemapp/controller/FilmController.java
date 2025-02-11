package me.fagiolini.cinemapp.controller;

import me.fagiolini.cinemapp.db.tables.pojos.Film;
import me.fagiolini.cinemapp.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping("/film")
    public List<Film> getFilm() {
        return this.filmService.getAllFilms();
    }

    @GetMapping("/film/{id}")
    public Film getFilm(@PathVariable long id) {
        return this.filmService.getFilmById(id);
    }

    @PostMapping("/insertFilm")
    public void insertFilm(@RequestBody Film film) {
        this.filmService.insertFilm(film);
    }

    @DeleteMapping("/deleteFilm/{id}")
    public void deleteFilm(@PathVariable long id) {
        this.filmService.deleteFilmById(id);
    }

    @PutMapping("/updateFilm")
    public void updateFilm(@RequestBody Film film) {
        this.filmService.updateFilm(film);
    }

    @GetMapping("/filmByProiezione/{id}")
    public Film getFilmByProiezione(@PathVariable long id) {
        return this.filmService.getFilmByProiezione(id);
    }
}
