package ru.fazlyev.cinephile.service;

import ru.fazlyev.cinephile.domain.Author;

import java.util.List;

public interface AuthorService {
    Author getAuthorById(String id);

    List<Author> getAuthorsByName(String name);

    List<Author> getAll();
}
