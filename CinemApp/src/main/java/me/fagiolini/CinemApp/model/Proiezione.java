package me.fagiolini.CinemApp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Proiezione {
    @Id
    private long id;
    private Date dataOraInizio;
    private Date dataOraFine;
    private double prezzo;
    @OneToOne
    private Film film;
    @OneToOne
    private Sala sala;
}
