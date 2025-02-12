/*
 * This file is generated by jOOQ.
 */
package me.fagiolini.cinemapp.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Proiezione implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDateTime dataOraFine;
    private LocalDateTime dataOraInizio;
    private Double prezzo;
    private Long filmId;
    private Long salaId;

    public Proiezione() {}

    public Proiezione(Proiezione value) {
        this.id = value.id;
        this.dataOraFine = value.dataOraFine;
        this.dataOraInizio = value.dataOraInizio;
        this.prezzo = value.prezzo;
        this.filmId = value.filmId;
        this.salaId = value.salaId;
    }

    public Proiezione(
        Long id,
        LocalDateTime dataOraFine,
        LocalDateTime dataOraInizio,
        Double prezzo,
        Long filmId,
        Long salaId
    ) {
        this.id = id;
        this.dataOraFine = dataOraFine;
        this.dataOraInizio = dataOraInizio;
        this.prezzo = prezzo;
        this.filmId = filmId;
        this.salaId = salaId;
    }

    /**
     * Getter for <code>cinemapp.proiezione.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>cinemapp.proiezione.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>cinemapp.proiezione.data_ora_fine</code>.
     */
    public LocalDateTime getDataOraFine() {
        return this.dataOraFine;
    }

    /**
     * Setter for <code>cinemapp.proiezione.data_ora_fine</code>.
     */
    public void setDataOraFine(LocalDateTime dataOraFine) {
        this.dataOraFine = dataOraFine;
    }

    /**
     * Getter for <code>cinemapp.proiezione.data_ora_inizio</code>.
     */
    public LocalDateTime getDataOraInizio() {
        return this.dataOraInizio;
    }

    /**
     * Setter for <code>cinemapp.proiezione.data_ora_inizio</code>.
     */
    public void setDataOraInizio(LocalDateTime dataOraInizio) {
        this.dataOraInizio = dataOraInizio;
    }

    /**
     * Getter for <code>cinemapp.proiezione.prezzo</code>.
     */
    public Double getPrezzo() {
        return this.prezzo;
    }

    /**
     * Setter for <code>cinemapp.proiezione.prezzo</code>.
     */
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Getter for <code>cinemapp.proiezione.film_id</code>.
     */
    public Long getFilmId() {
        return this.filmId;
    }

    /**
     * Setter for <code>cinemapp.proiezione.film_id</code>.
     */
    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    /**
     * Getter for <code>cinemapp.proiezione.sala_id</code>.
     */
    public Long getSalaId() {
        return this.salaId;
    }

    /**
     * Setter for <code>cinemapp.proiezione.sala_id</code>.
     */
    public void setSalaId(Long salaId) {
        this.salaId = salaId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Proiezione other = (Proiezione) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.dataOraFine == null) {
            if (other.dataOraFine != null)
                return false;
        }
        else if (!this.dataOraFine.equals(other.dataOraFine))
            return false;
        if (this.dataOraInizio == null) {
            if (other.dataOraInizio != null)
                return false;
        }
        else if (!this.dataOraInizio.equals(other.dataOraInizio))
            return false;
        if (this.prezzo == null) {
            if (other.prezzo != null)
                return false;
        }
        else if (!this.prezzo.equals(other.prezzo))
            return false;
        if (this.filmId == null) {
            if (other.filmId != null)
                return false;
        }
        else if (!this.filmId.equals(other.filmId))
            return false;
        if (this.salaId == null) {
            if (other.salaId != null)
                return false;
        }
        else if (!this.salaId.equals(other.salaId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.dataOraFine == null) ? 0 : this.dataOraFine.hashCode());
        result = prime * result + ((this.dataOraInizio == null) ? 0 : this.dataOraInizio.hashCode());
        result = prime * result + ((this.prezzo == null) ? 0 : this.prezzo.hashCode());
        result = prime * result + ((this.filmId == null) ? 0 : this.filmId.hashCode());
        result = prime * result + ((this.salaId == null) ? 0 : this.salaId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Proiezione (");

        sb.append(id);
        sb.append(", ").append(dataOraFine);
        sb.append(", ").append(dataOraInizio);
        sb.append(", ").append(prezzo);
        sb.append(", ").append(filmId);
        sb.append(", ").append(salaId);

        sb.append(")");
        return sb.toString();
    }
}
