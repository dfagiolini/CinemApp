package me.fagiolini.CinemApp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Proiezione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date dataOraInizio;
    private Date dataOraFine;
    private double prezzo;
    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;
}
