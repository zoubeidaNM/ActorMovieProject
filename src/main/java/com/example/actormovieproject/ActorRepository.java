package com.example.actormovieproject;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Long>{
    Iterable<Actor> findAllByRealnameContainingIgnoreCase(String s);
    Iterable<Actor> findAllByMoviesNotContaining(Movie thisMovies);
}
