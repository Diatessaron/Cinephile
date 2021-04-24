package ru.fazlyev.cinephile.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Objects;

@Document(collation = "films")
public class Film {
    @Id
    private String id;
    @Field("title")
    private String title;
    @Field("author")
    @DBRef(db = "authors")
    private Author author;
    @Field("genre")
    @DBRef(db = "genres")
    private Genre genre;
    @Field("premiere")
    private LocalDateTime premiere;
    @Field("duration")
    private int duration;
    @Field("description")
    private String description;
    @Field("review")
    private Review review;
    @Field("rating")
    private int rating;
    //implement imageCover later

    public Film() {
    }

    //Delete second constructor later and regenerate equals & hashcode
    public Film(String title, Author author, Genre genre, LocalDateTime premiere, int duration, String description, Review review, int rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.premiere = premiere;
        this.duration = duration;
        this.description = description;
        this.review = review;
        this.rating = rating;
    }

    public Film(String id, String title, Author author, Genre genre, LocalDateTime premiere, int duration, String description, Review review, int rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.premiere = premiere;
        this.duration = duration;
        this.description = description;
        this.review = review;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDateTime getPremiere() {
        return premiere;
    }

    public void setPremiere(LocalDateTime premiere) {
        this.premiere = premiere;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return duration == film.duration && rating == film.rating && Objects.equals(id, film.id) && title.equals(film.title) && author.equals(film.author) && genre.equals(film.genre) && premiere.equals(film.premiere) && description.equals(film.description) && review.equals(film.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, genre, premiere, duration, description, review, rating);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", genre=" + genre +
                ", premiere=" + premiere +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", review=" + review +
                ", rating=" + rating +
                '}';
    }
}
