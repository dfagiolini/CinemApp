package me.fagiolini.CinemApp.services;

import java.util.List;

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

    public Proiezione getProiezioneByID(long id) {
        return this.proiezioneRepository.getById(id);
    }

    public void deleteByID(long id) {
        this.proiezioneRepository.deleteById(id);
    }

    public Proiezione getById(long id) {
        return this.proiezioneRepository.getById(id);
    }

     public List<Proiezione> saveAll(List<Proiezione> proiezioni) {
        return this.proiezioneRepository.saveAll(proiezioni);
    }
}
