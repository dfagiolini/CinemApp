package me.fagiolini.cinemapp.controller;

import me.fagiolini.cinemapp.service.ProiezioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProiezioneController {
    @Autowired
    private ProiezioneService proiezioneService;
    @GetMapping("/getDisponibilita/{id}")
    public int getDisponibilita(@PathVariable(name ="id") long proiezioneId) {
        return proiezioneService.getDisponibilita(proiezioneId);
    }
}
