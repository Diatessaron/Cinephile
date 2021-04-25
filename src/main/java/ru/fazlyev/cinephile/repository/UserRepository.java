package ru.fazlyev.cinephile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fazlyev.cinephile.domain.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Optional<User> findByFavorites_Title(String favoritesTitle);

    Optional<User> findByWatched_Title(String watchedTitle);

    Optional<User> findByWatchlist_Title(String watchlistTitle);
}
