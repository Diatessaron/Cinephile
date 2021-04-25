package ru.fazlyev.cinephile.service.impl;

import org.springframework.stereotype.Service;
import ru.fazlyev.cinephile.domain.Film;
import ru.fazlyev.cinephile.repository.FilmRepository;
import ru.fazlyev.cinephile.service.FilmService;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public Film getFilmById(String id) {
        return filmRepository.findById(id).orElseThrow
                (() -> new IllegalArgumentException("Film not found"));
    }

    @Override
    public List<Film> getFilmsByTitle(String title) {
        return filmRepository.findByTitle(title);
    }

    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }
}
