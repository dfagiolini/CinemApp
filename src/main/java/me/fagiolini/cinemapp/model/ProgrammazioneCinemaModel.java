package me.fagiolini.cinemapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.fagiolini.cinemapp.db.tables.pojos.Film;
import me.fagiolini.cinemapp.db.tables.pojos.Proiezione;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammazioneCinemaModel {
    private Film film;
    private List<Proiezione> proiezioni;


}
