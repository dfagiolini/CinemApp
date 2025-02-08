package me.fagiolini.CinemApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.fagiolini.CinemApp.model.Cinema;
import me.fagiolini.CinemApp.model.Sala;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    @Query(value = "select c.* from proiezione p , cinema c , sala s , film f where c.id = s.cinema_id and p.sala_id = s.id and f.id = p.film_id and f.id = ?1;", nativeQuery = true)
    List<Cinema> findCinemaByFilm(long filmId);
}
