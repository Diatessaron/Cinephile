package ru.fazlyev.cinephile.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;
import java.util.Set;

@Document(collection = "genres")
public class Genre {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("films")
    @DBRef(db = "films")
    private Set<Film> films;

    public Genre() {
    }

    //Delete second constructor later and regenerate equals & hashcode
    public Genre(String name, Set<Film> films) {
        this.name = name;
        this.films = films;
    }

    public Genre(String id, String name, Set<Film> films) {
        this.id = id;
        this.name = name;
        this.films = films;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(id, genre.id) && name.equals(genre.name) && films.equals(genre.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, films);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", films=" + films +
                '}';
    }
}
