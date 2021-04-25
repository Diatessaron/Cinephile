package ru.fazlyev.cinephile.service.impl;

import org.springframework.stereotype.Service;
import ru.fazlyev.cinephile.domain.Genre;
import ru.fazlyev.cinephile.repository.GenreRepository;
import ru.fazlyev.cinephile.service.GenreService;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre getGenreById(String id) {
        return genreRepository.findById(id).orElseThrow
                (() -> new IllegalArgumentException("Genre not found"));
    }

    @Override
    public List<Genre> getGenreByName(String name) {
        return genreRepository.findByName(name);
    }

    @Override
    public List<Genre> getAll() {
        return genreRepository.findAll();
    }
}
