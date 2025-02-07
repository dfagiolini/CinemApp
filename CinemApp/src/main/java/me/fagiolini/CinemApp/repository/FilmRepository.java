package me.fagiolini.CinemApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.fagiolini.CinemApp.model.Film;
import org.springframework.data.repository.query.Param;

public interface FilmRepository extends JpaRepository<Film, Long> {
    
    /* @Query("SELECT DISTINCT f FROM Proiezione p JOIN p.film f JOIN p.sala s JOIN s.cinema c WHERE c.id = ?1")
    List<Film> findFilmByCinema(long cinemaId); */
    
//    @Query(value = "select f.* from proiezione p , cinema c , sala s , film f where c.id = s.cinema_id and p.sala_id = s.id and f.id = p.film_id and c.id = ?1;", nativeQuery = true)
//    List<Film> findFilmByCinema(long cinemaId);

    @Query("SELECT DISTINCT f FROM Proiezione p JOIN p.film f JOIN p.sala s JOIN s.cinema c WHERE c.id = :cinemaId")
    List<Film> findFilmByCinema(@Param("cinemaId") long cinemaId);

}
