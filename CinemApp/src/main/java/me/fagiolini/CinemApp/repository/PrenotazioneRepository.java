package me.fagiolini.CinemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.fagiolini.CinemApp.model.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

}
