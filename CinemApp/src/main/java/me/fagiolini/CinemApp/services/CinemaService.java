package me.fagiolini.CinemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Cinema;
import me.fagiolini.CinemApp.repository.CinemaRepository;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public Cinema saveCinema(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    public Cinema getCinema(long id) {
        return this.cinemaRepository.getById(id);

    }

    public List<Cinema> getAllCinemas() {
        return this.cinemaRepository.findAll();
    }

    public void deleteCinemaByID(long id) {
        this.cinemaRepository.deleteById(id);
    }
}
