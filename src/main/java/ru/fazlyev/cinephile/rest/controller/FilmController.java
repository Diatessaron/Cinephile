package ru.fazlyev.cinephile.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.fazlyev.cinephile.domain.Film;
import ru.fazlyev.cinephile.service.FilmService;

import java.util.List;

@RestController
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/api/films/id")
    public ResponseEntity<Film> getFilmById(@RequestParam String id) {
        return ResponseEntity.status(HttpStatus.OK).body(filmService.getFilmById(id));
    }

    @GetMapping("/api/films/{title}")
    public ResponseEntity<List<Film>> getFilmsByTitle(@PathVariable String title) {
        return ResponseEntity.status(HttpStatus.OK).body(filmService.getFilmsByTitle(title));
    }

    @GetMapping("/api/films")
    public ResponseEntity<List<Film>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(filmService.getAll());
    }
}
