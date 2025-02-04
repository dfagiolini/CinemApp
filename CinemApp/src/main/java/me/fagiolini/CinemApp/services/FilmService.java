package me.fagiolini.CinemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Film;
import me.fagiolini.CinemApp.repository.FilmRepository;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    public Film getById(long id) {
        return this.filmRepository.getById(id);
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
}
