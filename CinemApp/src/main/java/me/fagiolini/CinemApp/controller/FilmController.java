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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;




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

    @PostMapping("/insertFilms")
    public List<Film> postFilm(@RequestBody List<Film> films) {
        return this.filmService.saveAll(films);
    }

    @PutMapping("updateFilm")
    public Film putFilm(@RequestBody Film film) {
        
        return this.filmService.save(film);
    }
    
    @DeleteMapping("/deleteFilm/{id}")
    public void deleteByID (@PathVariable("id") long id) {
        this.filmService.deleteByID(id);
    }
    
    

}
