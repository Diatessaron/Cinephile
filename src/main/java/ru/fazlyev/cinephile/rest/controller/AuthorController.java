package ru.fazlyev.cinephile.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.fazlyev.cinephile.domain.Author;
import ru.fazlyev.cinephile.service.AuthorService;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/api/authors/id")
    public ResponseEntity<Author> getAuthorById(@RequestParam String id){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAuthorById(id));
    }

    @GetMapping("/api/authors/{name}")
    public ResponseEntity<List<Author>> getAuthorsByName(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAuthorsByName(name));
    }

    @GetMapping("/api/authors")
    public ResponseEntity<List<Author>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAll());
    }
}
