package me.fagiolini.CinemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.fagiolini.CinemApp.model.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

}
