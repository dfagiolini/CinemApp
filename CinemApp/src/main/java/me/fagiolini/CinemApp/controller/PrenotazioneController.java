package me.fagiolini.CinemApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import me.fagiolini.CinemApp.model.Prenotazione;
import me.fagiolini.CinemApp.services.PrenotazioneService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class PrenotazioneController {
    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping("/prenotazione/{id}")
    public Optional<Prenotazione> getPrenotazione(@PathVariable(name = "id") long id) {
        return this.prenotazioneService.getPrenotazioneById(id);
    }

    @PostMapping("/insertPrenotazione")
    public Prenotazione postPrenotazione(@RequestBody Prenotazione prenotazione) {
        
        return this.prenotazioneService.save(prenotazione);
    }
    
    @DeleteMapping("/deletePrenotazione")
    public void deletePrenotazione(@RequestParam long id) {
        this.prenotazioneService.deleteByID(id);
    }    

    @PutMapping("/updatePrenotazione")
    public Prenotazione updatePrenotazione(@RequestBody Prenotazione prenotazione) {
        return this.prenotazioneService.save(prenotazione);
    }
}
