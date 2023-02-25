package com.devsuperior.movieflix.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subTitle;
    @Lob
    private String synopsis;

    private Integer year;

    private String imgUrl;
    @ManyToOne
    private Genre genre;

    @OneToMany
    private List<Review> reviews = new ArrayList<>();

    public Movie() {
    }

    public Movie(Long id, String title, String subTitle, String synopsis, Integer year, String imgUrl, Genre genre) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.synopsis = synopsis;
        this.year = year;
        this.imgUrl = imgUrl;
        this.genre = genre;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgYear) {
        this.imgUrl = imgYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
