package me.fagiolini.CinemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.fagiolini.CinemApp.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
