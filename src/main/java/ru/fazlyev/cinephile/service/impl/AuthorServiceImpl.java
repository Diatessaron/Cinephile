package ru.fazlyev.cinephile.service.impl;

import org.springframework.stereotype.Service;
import ru.fazlyev.cinephile.domain.Author;
import ru.fazlyev.cinephile.repository.AuthorRepository;
import ru.fazlyev.cinephile.service.AuthorService;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getAuthorById(String id) {
        return authorRepository.findById(id).orElseThrow
                (() -> new IllegalArgumentException("Author not found"));
    }

    @Override
    public List<Author> getAuthorsByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public List<Author> getAll(){
        return authorRepository.findAll();
    }
}
