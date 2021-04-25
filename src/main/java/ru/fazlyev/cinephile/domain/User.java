package ru.fazlyev.cinephile.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;
import java.util.Set;

@Document("users")
public class User {
    @Id
    private String id;
    @Field("username")
    private String username;
    @Field("password")
    private String password;
    @Field("role")
    private Role role;
    @Field("favorites")
    @DBRef(db = "films")
    private Set<Film> favorites;
    @Field("watched")
    @DBRef(db = "films")
    private Set<Film> watched;
    @Field("watchlist")
    @DBRef(db = "films")
    private Set<Film> watchlist;

    public User() {
    }

    //Delete second constructor later and regenerate equals & hashcode
    public User(String username, String password, Role role, Set<Film> favorites, Set<Film> watched, Set<Film> watchlist) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.favorites = favorites;
        this.watched = watched;
        this.watchlist = watchlist;
    }

    public User(String id, String username, String password, Role role, Set<Film> favorites, Set<Film> watched, Set<Film> watchlist) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.favorites = favorites;
        this.watched = watched;
        this.watchlist = watchlist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Film> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<Film> favorites) {
        this.favorites = favorites;
    }

    public Set<Film> getWatched() {
        return watched;
    }

    public void setWatched(Set<Film> watched) {
        this.watched = watched;
    }

    public Set<Film> getWatchlist() {
        return watchlist;
    }

    public void setWatchlist(Set<Film> watchlist) {
        this.watchlist = watchlist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && username.equals(user.username) && password.equals(user.password) && role.equals(user.role) && favorites.equals(user.favorites) && watched.equals(user.watched) && watchlist.equals(user.watchlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, role, favorites, watched, watchlist);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
