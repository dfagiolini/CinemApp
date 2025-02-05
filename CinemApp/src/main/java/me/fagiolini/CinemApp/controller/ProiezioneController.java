package me.fagiolini.CinemApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import me.fagiolini.CinemApp.model.Proiezione;
import me.fagiolini.CinemApp.services.ProiezioneService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProiezioneController {
    @Autowired
    private ProiezioneService proiezioneService;

    @GetMapping("/proiezione")
    public Proiezione proiezione(@RequestParam long id) {
        return this.proiezioneService.getById(id);
    }

    @PostMapping("/insertProiezione")
    public Proiezione postProiezione(@RequestBody Proiezione proiezione) {

        return this.proiezioneService.save(proiezione);
    }

    @PutMapping("/updateProiezione")
    public Proiezione proiezione(@RequestBody Proiezione proiezione) {
        return this.proiezioneService.save(proiezione);
    }

    @DeleteMapping("/deleteProiezione")
    public void deleteProiezione(@RequestParam long id) {
        this.proiezioneService.deleteByID(id);
    }
}
