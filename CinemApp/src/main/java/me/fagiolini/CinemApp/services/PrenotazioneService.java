package me.fagiolini.CinemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Prenotazione;
import me.fagiolini.CinemApp.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> getPrenotazioni() {
        return this.prenotazioneRepository.findAll();
    }

    public Prenotazione getPrenotazioneById(long id) {
        return this.prenotazioneRepository.getById(id);
    }

    public void deleteByID(long id) {
        this.prenotazioneRepository.deleteById(id);
    }
    
    public Prenotazione save(Prenotazione prenotazione) {
        return this.prenotazioneRepository.save(prenotazione);
    }
 public List<Prenotazione> saveAll(List<Prenotazione> prenotazioni) {
        return this.prenotazioneRepository.saveAll(prenotazioni);
    }

}
