package ru.fazlyev.cinephile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fazlyev.cinephile.domain.Film;

import java.util.List;

public interface FilmRepository extends MongoRepository<Film, String> {
    List<Film> findByTitle(String title);
}
