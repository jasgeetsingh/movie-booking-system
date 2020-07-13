package com.mbs.adminservice.service.impl;


import com.mbs.adminservice.exception.MovieNotFoundException;
import com.mbs.adminservice.model.Movie;
import com.mbs.adminservice.model.Screening;
import com.mbs.adminservice.repository.MovieRepository;
import com.mbs.adminservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;


    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long movie_id) {
        return movieRepository.findById(movie_id).orElseThrow(() -> new MovieNotFoundException(movie_id));
    }

    @Override
    public Movie addMovie(Movie newMovie) {

        return movieRepository.save(newMovie);
    }

    @Override
    public Movie updateMovie(Movie updatedMovie, Long movie_id) {
        return null;
    }


    @Override
    public void deleteMovie(Long movie_id) {
        movieRepository.deleteById(movie_id);
    }

}
