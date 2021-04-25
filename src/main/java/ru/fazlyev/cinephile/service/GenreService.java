package ru.fazlyev.cinephile.service;

import ru.fazlyev.cinephile.domain.Genre;

import java.util.List;

public interface GenreService {
    Genre getGenreById(String id);

    List<Genre> getGenreByName(String name);

    List<Genre> getAll();
}
