package ru.fazlyev.cinephile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fazlyev.cinephile.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends MongoRepository<Author, String> {
    List<Author> findByName(String name);

    Optional<Author> findByFilms_Title(String filmTitle);
}
