package me.fagiolini.CinemApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.fagiolini.CinemApp.model.Film;
import me.fagiolini.CinemApp.model.Proiezione;
import me.fagiolini.CinemApp.model.Sala;

public interface ProiezioneRepository extends JpaRepository<Proiezione, Long> {
    @Query(value = "select p.* from proiezione p , cinema c , cinema_sale cs , sala s , film f where c.id = cs.cinema_id and s.id = cs.sale_id and p.sala_id = s.id and f.id = p.film_id and c.id = ?1;", nativeQuery = true)
    List<Proiezione> findProiezioneByCinema(long cinemaId);

    @Query(value = "select p.* from proiezione p , cinema c , cinema_sale cs , sala s , film f where c.id = cs.cinema_id and s.id = cs.sale_id and p.sala_id = s.id and f.id = p.film_id and f.id = ?1;", nativeQuery = true)
    List<Proiezione> findProiezioneByFilm(long filmId);
}
