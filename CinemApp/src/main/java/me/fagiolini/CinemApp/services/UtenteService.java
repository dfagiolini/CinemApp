package me.fagiolini.CinemApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Utente;
import me.fagiolini.CinemApp.repository.UtenteRepository;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> findAll() {
        return this.utenteRepository.findAll();
    }

    public Optional<Utente> getById(long id) {
        return this.utenteRepository.findById(id);
    }

    public void deleteById(long id) {
        this.utenteRepository.deleteById(id);
    }

    public Utente save(Utente utente) {
        return this.utenteRepository.save(utente);
    }

    public List<Utente> saveAll(List<Utente> utenti) {
        return this.utenteRepository.saveAll(utenti);
    }
    
}
