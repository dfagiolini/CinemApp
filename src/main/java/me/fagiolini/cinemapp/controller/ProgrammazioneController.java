package me.fagiolini.cinemapp.controller;

import me.fagiolini.cinemapp.model.ProgrammazioneCinemaModel;
import me.fagiolini.cinemapp.model.ProgrammazioneFilmModel;
import me.fagiolini.cinemapp.service.ProgrammazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgrammazioneController {
    @Autowired
    private ProgrammazioneService programmazioneService;

    @GetMapping(value = "/ProgrammazioneFilm/{id}",produces = "application/json")
    public List<ProgrammazioneFilmModel> getProgrammazioneFilm(@PathVariable(name = "id") long id) {
        return programmazioneService.getProgrammazioneFilm(id);
    }
    @GetMapping(value = "/ProgrammazioneCinema/{id}",produces = "application/json")
    public List<ProgrammazioneCinemaModel> getProgrammazioneCinema(@PathVariable(name = "id") long id) {
        return programmazioneService.getProgrammazioneCinema(id);
    }

}
