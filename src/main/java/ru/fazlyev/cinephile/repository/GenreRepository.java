package ru.fazlyev.cinephile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fazlyev.cinephile.domain.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreRepository extends MongoRepository<Genre, String> {
    List<Genre> findByName(String name);

    Optional<Genre> findByFilms_Title(String filmTitle);
}
