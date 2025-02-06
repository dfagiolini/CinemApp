package me.fagiolini.CinemApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Film;
import me.fagiolini.CinemApp.model.Utente;
import me.fagiolini.CinemApp.repository.FilmRepository;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    public Optional<Film> getById(long id) {
        return this.filmRepository.findById(id);
    }

    public Film save(Film film) {
        return this.filmRepository.save(film);
    }

    public List<Film> saveAll(List<Film> films) {
        return this.filmRepository.saveAll(films);
    }

    public void deleteByID(long id) {
        this.filmRepository.deleteById(id);
    }

    public List<Film> findFilmByCinema(long cinema_id) {
        return this.filmRepository.findFilmByCinema(cinema_id);
    }

    
}
