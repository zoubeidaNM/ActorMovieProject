package com.example.actormovieproject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String realname;
    private String headshot;

// why not using the Fetch and when to use it?
    @ManyToMany(mappedBy="cast")
    private Set<Movie> movies;


    public Actor()
    {

        // have to instatiate the movie Set to be able to add movies to it
        movies = new HashSet<Movie>();
    }

    public void addMovie(Movie m)
    {
        // to add a movie without having to get the movies set.
        movies.add(m);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }
}
