package me.fagiolini.CinemApp.controller;

import org.springframework.web.bind.annotation.RestController;

import me.fagiolini.CinemApp.model.Sala;
import me.fagiolini.CinemApp.services.SalaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping("/getSala")
    public Sala getSala(@RequestParam long id) {
        return this.salaService.getSalaById(id);
    }

    @GetMapping("/getSale")
    public List<Sala> getSale() {
        return this.salaService.getAllSalas();
    }

    @PostMapping("/insertSala")
    public Sala insertSala(@RequestBody Sala sala) {

        return this.salaService.save(sala);
    }

    @PostMapping("/insertSale")
    public List<Sala> insertSale(@RequestBody List<Sala> sale) {

        return this.salaService.saveAll(sale);
    }

    @DeleteMapping("/deleteSala/{id}")
    public void deleteByID(@PathVariable("id") long id) {
        this.salaService.deleteByID(id);
    }

    @PutMapping("updateSala")
    public Sala putSala(@RequestBody Sala sala) {
        return this.salaService.save(sala);

    }

    @DeleteMapping("/deleteSala")
    public void requestMethodName(@RequestParam long id) {
        this.salaService.deleteByID(id);;
    }
    

}
