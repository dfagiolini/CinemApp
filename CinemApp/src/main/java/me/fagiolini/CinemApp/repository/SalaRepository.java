package me.fagiolini.CinemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.fagiolini.CinemApp.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {

}
