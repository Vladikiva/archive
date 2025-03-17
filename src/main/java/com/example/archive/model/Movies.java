package com.example.archive.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "media")
    private String media;
    @Column(name = "mediatype")
    private String mediatype;
    @Column(name = "source")
    private String source;
    @Column(name = "dateadded")
    private int dateadded;
    @Column(name = "originaltitle")
    private String originaltitle;
    @Column(name = "director")
    private String director;
    @Column(name = "year")
    private int year;
    @Column(name = "description")
    private String description;
    @Column(name = "comments")
    private String comments;


    public Movies(Long id, String media, String mediatype, String source,
                  int dateadded, String originaltitle, String director,
                  int year, String description, String comments) {
        this.id = id;
        this.media = media;
        this.mediatype = mediatype;
        this.source = source;
        this.dateadded = dateadded;
        this.originaltitle = originaltitle;
        this.director = director;
        this.year = year;
        this.description = description;
        this.comments = comments;
    }

    public Movies() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMediaType() {
        return mediatype;
    }

    public void setMediaType(String mediatype) {
        this.mediatype = mediatype;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getDateAdded() {
        return dateadded;
    }

    public void setDateAdded(int dateadded) {
        this.dateadded = dateadded;
    }

    public String getOriginalTitle() {
        return originaltitle;
    }

    public void setOriginalTitle(String originaltitle) {
        this.originaltitle = originaltitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + media + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                '}';
    }
}
