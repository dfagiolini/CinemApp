package me.fagiolini.cinemapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.fagiolini.cinemapp.db.tables.pojos.Cinema;
import me.fagiolini.cinemapp.service.CinemaService;


@RestController
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/cinema")
    public List<Cinema> getAllCinema() {
        return this.cinemaService.getAllCinema();
    }

    @GetMapping("/cinema/{id}")
    public Cinema getCinemaById(@PathVariable long id) {
        return this.cinemaService.getCinemaById(id);
    }

    @PostMapping("/insertCinema")
    public void insertCinema(@RequestBody Cinema cinema) {
        this.cinemaService.saveCinema(cinema);
    }

    @DeleteMapping("/deleteCinema/{id}")
    public void deleteCinema(@PathVariable long id) {
        this.cinemaService.deleteCinema(id);
    }

    @PutMapping("/updateCinema")
    public void updateCinema(@RequestBody Cinema cinema) {
        this.cinemaService.updateCinema(cinema);
    }
}
