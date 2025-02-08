package me.fagiolini.CinemApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import me.fagiolini.CinemApp.model.Cinema;
import me.fagiolini.CinemApp.services.CinemaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/getCinema/{id}")
    public Optional<Cinema> getCinema(@PathVariable(name = "id") long id) {
        return this.cinemaService.getCinema(id);
    }
    
    @GetMapping("/getAllCinema")
    public List<Cinema> getAllCinema() {
        return this.cinemaService.getAllCinemas();
    }

    @PostMapping("/insertCinema")
    public Cinema insertCinema(@RequestBody Cinema cinema) {
        
        return this.cinemaService.saveCinema(cinema);
    }
    
    @DeleteMapping("/deleteCinema/{id}")
    public void deleteCinema(@PathVariable("id") long id) {
        
    }
    
}
