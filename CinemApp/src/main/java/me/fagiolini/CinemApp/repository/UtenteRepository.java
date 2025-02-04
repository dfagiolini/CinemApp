package me.fagiolini.CinemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.fagiolini.CinemApp.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
