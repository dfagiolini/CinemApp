package me.fagiolini.cinemapp.controller;

import me.fagiolini.cinemapp.db.tables.pojos.Sala;
import me.fagiolini.cinemapp.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping("/sale")
    public List<Sala> getAll() {
        return this.salaService.getSale();
    }

    @GetMapping("/sala/{id}")
    public Sala getSala(@PathVariable long id) {
        return this.salaService.getSalaById(id);
    }

    @PostMapping("/insertSala")
    public void insertSala(@RequestBody Sala sala) {
        this.salaService.save(sala);
    }

    @PutMapping("/updateSala")
    public void updateSala(@RequestBody Sala sala) {
        this.salaService.update(sala);
    }

    @DeleteMapping("/deleteSala/{id}")
    public void deleteSala(@PathVariable long id) {
        this.salaService.deleteById(id);
    }

    @GetMapping("/getSalaByCinema/{id}")
    public List<Sala> getSalaByCinema(@PathVariable long id) {
        return this.salaService.getSalaByCinemaId(id);
    }

    @GetMapping("/getSalaByProiezione/{id}")
    public Sala getSalaByProiezione(@PathVariable long id) {
        return this.salaService.getSalaByProiezioneId(id);
    }
}
