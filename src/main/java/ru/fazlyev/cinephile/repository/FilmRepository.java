package ru.fazlyev.cinephile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fazlyev.cinephile.domain.Film;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface FilmRepository extends MongoRepository<Film, String> {
    List<Film> findByTitle(String title);

    List<Film> findByAuthor_Name(String authorName);

    List<Film> findByGenre_Name(String genreName);

    List<Film> findByPremiere(LocalDateTime premiere);

    Optional<Film> findByDescription(String description);

    Optional<Film> findByReview_Content(String reviewContent);

    List<Film> findByRating(int rating);
}
