package me.fagiolini.CinemApp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Prenotazione {
    @Id
    private long id;
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Proiezione proiezione;
    private int numeroBiglietti;
    private Date dataPrenotazione;
}
