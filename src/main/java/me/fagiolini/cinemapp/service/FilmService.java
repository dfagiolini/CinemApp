package me.fagiolini.cinemapp.service;

import me.fagiolini.cinemapp.db.tables.daos.FilmDao;
import me.fagiolini.cinemapp.db.tables.daos.ProiezioneDao;
import me.fagiolini.cinemapp.db.tables.pojos.Film;
import me.fagiolini.cinemapp.db.tables.pojos.Proiezione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmService {

    @Autowired
    private FilmDao filmDao;
    @Autowired
    ProiezioneDao proiezioneDao;

    public List<Film> getAllFilms() {
        return this.filmDao.findAll();
    }
    public Film getFilmById(long id) {
        return this.filmDao.fetchOneById(id);
    }

    public void insertFilm(Film film) {
        this.filmDao.insert(film);
    }
    public void updateFilm(Film film) {
        this.filmDao.update(film);
    }
    public void deleteFilmById(long id) {
        this.filmDao.deleteById(id);
    }

    public Film getFilmByProiezione(Long proiezioneId) {
        Proiezione proiezione = this.proiezioneDao.fetchOneById(proiezioneId);
        return this.filmDao.fetchOneById(proiezione.getFilmId());
    }

}
