package me.fagiolini.CinemApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Film {
    @Id
    private long id;
    private String titolo;
    private int durata;
    private String genere;
    private String regia;
    private String descrizione;
    private String copertina;
}
