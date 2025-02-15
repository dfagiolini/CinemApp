/*
 * This file is generated by jOOQ.
 */
package me.fagiolini.cinemapp.db.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

import me.fagiolini.cinemapp.db.tables.Proiezione;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "proiezione",
    schema = "cinemapp",
    uniqueConstraints = {
        @UniqueConstraint(name = "proiezione_data_ora_inizio_data_ora_fine_sala_id_key", columnNames = { "data_ora_inizio", "data_ora_fine", "sala_id" })
    }
)
public class ProiezioneRecord extends UpdatableRecordImpl<ProiezioneRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>cinemapp.proiezione.id</code>.
     */
    public ProiezioneRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cinemapp.proiezione.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cinemapp.proiezione.data_ora_fine</code>.
     */
    public ProiezioneRecord setDataOraFine(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cinemapp.proiezione.data_ora_fine</code>.
     */
    @Column(name = "data_ora_fine", nullable = false, precision = 6)
    @NotNull
    public LocalDateTime getDataOraFine() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>cinemapp.proiezione.data_ora_inizio</code>.
     */
    public ProiezioneRecord setDataOraInizio(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cinemapp.proiezione.data_ora_inizio</code>.
     */
    @Column(name = "data_ora_inizio", nullable = false, precision = 6)
    @NotNull
    public LocalDateTime getDataOraInizio() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>cinemapp.proiezione.prezzo</code>.
     */
    public ProiezioneRecord setPrezzo(Double value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cinemapp.proiezione.prezzo</code>.
     */
    @Column(name = "prezzo")
    public Double getPrezzo() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>cinemapp.proiezione.film_id</code>.
     */
    public ProiezioneRecord setFilmId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cinemapp.proiezione.film_id</code>.
     */
    @Column(name = "film_id", nullable = false)
    @NotNull
    public Long getFilmId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>cinemapp.proiezione.sala_id</code>.
     */
    public ProiezioneRecord setSalaId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>cinemapp.proiezione.sala_id</code>.
     */
    @Column(name = "sala_id", nullable = false)
    @NotNull
    public Long getSalaId() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProiezioneRecord
     */
    public ProiezioneRecord() {
        super(Proiezione.PROIEZIONE);
    }

    /**
     * Create a detached, initialised ProiezioneRecord
     */
    public ProiezioneRecord(Long id, LocalDateTime dataOraFine, LocalDateTime dataOraInizio, Double prezzo, Long filmId, Long salaId) {
        super(Proiezione.PROIEZIONE);

        setId(id);
        setDataOraFine(dataOraFine);
        setDataOraInizio(dataOraInizio);
        setPrezzo(prezzo);
        setFilmId(filmId);
        setSalaId(salaId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ProiezioneRecord
     */
    public ProiezioneRecord(me.fagiolini.cinemapp.db.tables.pojos.Proiezione value) {
        super(Proiezione.PROIEZIONE);

        if (value != null) {
            setId(value.getId());
            setDataOraFine(value.getDataOraFine());
            setDataOraInizio(value.getDataOraInizio());
            setPrezzo(value.getPrezzo());
            setFilmId(value.getFilmId());
            setSalaId(value.getSalaId());
            resetChangedOnNotNull();
        }
    }
}
