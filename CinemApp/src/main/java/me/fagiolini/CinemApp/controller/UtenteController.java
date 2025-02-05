package me.fagiolini.CinemApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import me.fagiolini.CinemApp.model.Utente;
import me.fagiolini.CinemApp.services.UtenteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/utenti")
    public List<Utente> getUtenti() {
        return this.utenteService.findAll();
    }

    @GetMapping("/utente")
    public Utente getUtente(@RequestParam long id) {
        return this.utenteService.getById(id);
    }

    @PostMapping("/insertUtente")
    public Utente postUtente(@RequestBody Utente utente) {

        return this.utenteService.save(utente);
    }

    @PostMapping("/insertUtenti")
    public List<Utente> postUtenti(@RequestBody List<Utente> utenti) {

        return this.utenteService.saveAll(utenti);
    }

    @PutMapping("/updateUtente")
    public Utente putUtente(@RequestBody Utente utente) {
        
        return this.utenteService.save(utente);
    }
}
