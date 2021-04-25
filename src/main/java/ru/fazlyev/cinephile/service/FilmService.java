package ru.fazlyev.cinephile.service;

import ru.fazlyev.cinephile.domain.Film;

import java.util.List;

public interface FilmService {
    Film getFilmById(String id);

    List<Film> getFilmsByTitle(String title);

    List<Film> getAll();
}
