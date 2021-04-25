package ru.fazlyev.cinephile.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.fazlyev.cinephile.domain.Genre;
import ru.fazlyev.cinephile.service.GenreService;

import java.util.List;

@RestController
public class GenreController {
    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/api/genre/id")
    public ResponseEntity<Genre> getGenreById(@RequestParam String id) {
        return ResponseEntity.status(HttpStatus.OK).body(genreService.getGenreById(id));
    }

    @GetMapping("/api/genre/{name}")
    public ResponseEntity<List<Genre>> getGenreByName(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(genreService.getGenreByName(name));
    }

    @GetMapping("/api/genre")
    public ResponseEntity<List<Genre>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(genreService.getAll());
    }
}
