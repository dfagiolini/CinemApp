package me.fagiolini.cinemapp.service;

import me.fagiolini.cinemapp.db.tables.daos.PrenotazioneDao;
import me.fagiolini.cinemapp.db.tables.daos.ProiezioneDao;
import me.fagiolini.cinemapp.db.tables.daos.SalaDao;
import me.fagiolini.cinemapp.db.tables.pojos.Prenotazione;
import me.fagiolini.cinemapp.db.tables.pojos.Proiezione;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static me.fagiolini.cinemapp.db.Tables.PRENOTAZIONE;
import static me.fagiolini.cinemapp.db.Tables.PROIEZIONE;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.sum;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneDao prenotazioneDao;
    @Autowired
    private ProiezioneDao proiezioneDao;
    @Autowired
    private SalaDao salaDao;
    @Autowired
    private ProiezioneService proiezioneService;

    private final DSLContext create;

    public PrenotazioneService(DSLContext dslContext) {
        this.create = dslContext;
    }

    public List<Prenotazione> getPrenotazioni() {
        return this.prenotazioneDao.findAll();
    }

    public Prenotazione getPrenotazione(long id) {
        return this.prenotazioneDao.findById(id);
    }

    public void save(Prenotazione prenotazione) {
        if (this.proiezioneService.getDisponibilita(prenotazione.getProiezioneId()) > 0)
            this.prenotazioneDao.insert(prenotazione);

    }

    public void delete(long id) {
        this.prenotazioneDao.deleteById(id);
    }



}
