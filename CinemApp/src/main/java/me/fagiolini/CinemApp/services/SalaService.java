package me.fagiolini.CinemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.model.Sala;
import me.fagiolini.CinemApp.repository.SalaRepository;
@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> getAllSalas() {
        return this.salaRepository.findAll();
    }

    public Sala getSalaById(long id) {
        return this.salaRepository.getById(id);
    }

    public void deleteByID(long id) {
        this.salaRepository.deleteById(id);
    }

    public Sala save(Sala sala) {
        return this.salaRepository.save(sala);
    }

     public List<Sala> saveAll(List<Sala> sale) {
        return this.salaRepository.saveAll(sale);
    }


}
