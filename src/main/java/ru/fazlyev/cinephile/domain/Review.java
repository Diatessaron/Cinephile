package ru.fazlyev.cinephile.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document("reviews")
public class Review {
    @Id
    private String id;
    @Field("content")
    private String content;

    public Review() {
    }

    //Delete second constructor later and regenerate equals & hashcode
    public Review(String content) {
        this.content = content;
    }

    public Review(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id) && content.equals(review.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
