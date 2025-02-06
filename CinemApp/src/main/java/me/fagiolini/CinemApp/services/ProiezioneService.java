package me.fagiolini.CinemApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Proiezione;
import me.fagiolini.CinemApp.repository.ProiezioneRepository;

@Service
public class ProiezioneService {
    @Autowired
    private ProiezioneRepository proiezioneRepository;

    public List<Proiezione> getAllProiezioni() {
        return this.proiezioneRepository.findAll();
    }

    public Optional<Proiezione> getProiezioneByID(long id) {
        return this.proiezioneRepository.findById(id);
    }

    public void deleteByID(long id) {
        this.proiezioneRepository.deleteById(id);
    }

    public Optional<Proiezione> getById(long id) {
        return this.proiezioneRepository.findById(id);
    }

     public List<Proiezione> saveAll(List<Proiezione> proiezioni) {
        return this.proiezioneRepository.saveAll(proiezioni);
    }

    public Proiezione save(Proiezione proiezione) {
        return this.proiezioneRepository.save(proiezione);
    }

    public List<Proiezione> findByCinema(long cinemaId) {
        return this.proiezioneRepository.findProiezioneByCinema(cinemaId);
    }
    public List<Proiezione> findByFilm(long cinemaId) {
        return this.proiezioneRepository.findProiezioneByFilm(cinemaId);
    }

}
