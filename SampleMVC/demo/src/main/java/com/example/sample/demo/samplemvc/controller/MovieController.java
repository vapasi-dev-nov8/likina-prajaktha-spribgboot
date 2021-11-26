package com.example.sample.demo.samplemvc.controller;

import com.example.sample.demo.samplemvc.service.MovieService;
import com.example.sample.demo.samplemvc.dto.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.sample.demo.samplemvc.entities.MovieEntity;

import javax.swing.text.html.Option;
import java.util.*;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

    MovieService movieServiceObj;

    @Autowired
    public MovieController(MovieService movieServiceObj) {
        this.movieServiceObj = movieServiceObj;
    }

    @GetMapping("/")
    public ResponseEntity<List<Movie>> getMovie()
    {
        List<Movie> movies = movieServiceObj.serviceInvoke();
return ResponseEntity.ok().body(movies);
    }

    /*@PostMapping("/")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        Movie movieWithId = movieServiceObj.saveMovie(movie);
        return new ResponseEntity<Movie>(movieWithId, HttpStatus.CREATED);

    }*/

    @PostMapping("/")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie movieWithId = movieServiceObj.saveMovie(movie);
        return new ResponseEntity<>(movieWithId, HttpStatus.CREATED);

    }
    @GetMapping("/{id}")

    public ResponseEntity<Movie> getMovieForId(@PathVariable String id) {
        Optional<Movie> movie = movieServiceObj.getMovie(id);
        if(movie.isPresent()) {
            return ResponseEntity.ok().body(movie.get());
        }
        return ResponseEntity.notFound().build();

    }
}
