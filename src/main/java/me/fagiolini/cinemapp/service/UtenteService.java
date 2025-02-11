package me.fagiolini.cinemapp.service;

import me.fagiolini.cinemapp.db.tables.daos.UtenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteDao utenteDao;

}
