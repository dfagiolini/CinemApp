package me.fagiolini.CinemApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import me.fagiolini.CinemApp.model.Film;
import me.fagiolini.CinemApp.services.FilmService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "localhost:2500")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @GetMapping("/films")
    public List<Film> getAllFilms() {
        return this.filmService.findAll();
    }
    @PostMapping("/insertFilm")
    public Film postFilm(@RequestBody Film film) {
        return this.filmService.save(film);
    }
    
    
    

}
