package me.fagiolini.cinemapp.model;

import java.util.Set;

import lombok.Data;

@Data

public class CinemaModel {

    private Long id;
    private String indirizzo;
    private String nome;
    private String telefono;
    private Set<SalaModel> sale;
}
