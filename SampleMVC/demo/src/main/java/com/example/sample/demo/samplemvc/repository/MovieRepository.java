package com.example.sample.demo.samplemvc.repository;

import com.example.sample.demo.samplemvc.entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, String> {



    /*List<Movie> movieList = new ArrayList(Arrays.asList(new Movie(100, "Hindi", "ShahRukh", "KaranJohar"),
       new Movie(101,"Tamil", "Vijay", "Shankar"),
        new Movie(102,"Malayalam", "Mohanlal", "Priyadarshan")));
    public List<Movie> repositoryInvoke() {

        return movieList;
    }

    public Movie saveMovie(Movie movie) {
        int newId = movieList.get(movieList.size() - 1).getId() + 1;
        Movie movieToBeSaved = new Movie(newId, movie.getMovie(), movie.getActor(), movie.getDirector());
        movieList.add(movieToBeSaved);
        return movieToBeSaved;
    }*/

    }

