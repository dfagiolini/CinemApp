package me.fagiolini.cinemapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.cinemapp.db.tables.daos.CinemaDao;
import me.fagiolini.cinemapp.db.tables.pojos.Cinema;

@Service
public class CinemaService {
    @Autowired
    private CinemaDao cinemaDao;

    public List<Cinema> getAllCinema() {
       return this.cinemaDao.findAll();
    }

    public Cinema getCinemaById(long id) {
        return this.cinemaDao.fetchOneById(id);
    }

    public void saveCinema(Cinema cinema) {
        this.cinemaDao.insert(cinema);
    }

    public void updateCinema(Cinema cinema) {
        this.cinemaDao.update(cinema);
    }

    public void deleteCinema(long id) {
        this.cinemaDao.deleteById(id);
    }
}
