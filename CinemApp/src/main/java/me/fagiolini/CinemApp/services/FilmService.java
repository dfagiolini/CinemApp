package me.fagiolini.CinemApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fagiolini.CinemApp.repository.FilmRepository;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;
}
