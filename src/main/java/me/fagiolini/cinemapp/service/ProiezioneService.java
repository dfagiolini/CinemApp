package me.fagiolini.cinemapp.service;

import me.fagiolini.cinemapp.db.tables.daos.ProiezioneDao;
import me.fagiolini.cinemapp.db.tables.daos.SalaDao;
import me.fagiolini.cinemapp.db.tables.pojos.Proiezione;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static me.fagiolini.cinemapp.db.Tables.PRENOTAZIONE;
import static org.jooq.impl.DSL.sum;

@Service
public class ProiezioneService {
    @Autowired
    private ProiezioneDao proiezioneDao;
    @Autowired
    private SalaDao salaDao;

    private final DSLContext create;

    public ProiezioneService(DSLContext dslContext) {
        this.create = dslContext;
    }

    public Proiezione getProiezioneById(long id) {
        return this.proiezioneDao.fetchOneById(id);
    }

    public List<Proiezione> getProiezioni() {
        return this.proiezioneDao.findAll();
    }

    public void save(Proiezione proiezione) {
        this.proiezioneDao.insert(proiezione);
    }

    public void update(Proiezione proiezione) {
        this.proiezioneDao.update(proiezione);
    }
    public void delete(long id) {
        this.proiezioneDao.deleteById(id);
    }

    public int getDisponibilita(long proiezioneId) {
        Proiezione proiezione = proiezioneDao.fetchOneById(proiezioneId);
        return this.salaDao.fetchOneById(proiezione.getSalaId()).getCapacita()
                - this.create.select(sum(PRENOTAZIONE.NUMERO_BIGLIETTI)).from(PRENOTAZIONE)
                .where(PRENOTAZIONE.PROIEZIONE_ID.eq(proiezione.getId())).fetchOneInto(Integer.class);
    }
}
