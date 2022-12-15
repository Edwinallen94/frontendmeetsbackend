package com.example.java_web_final_project;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movies {

    @Id
    @GeneratedValue
    private Integer id;
    private String movieName;
    private String actorName;

    public Movies(){

    }

    public Movies(String movieName, String actorName) {
        this.movieName = movieName;
        this.actorName = actorName;
    }

    public Movies(Integer id, String movieName, String actorName) {
        this.id = id;
        this.movieName = movieName;
        this.actorName = actorName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                '}';
    }
}
