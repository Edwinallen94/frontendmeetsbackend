package com.example.java_web_final_project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private  final MoviesRepository moviesRepository;

    public MoviesService(MoviesRepository moviesRepository){
        this.moviesRepository = moviesRepository;
    }

    public List<Movies> all() {
        return  moviesRepository.findAll();
    }

    public void add(Movies movies) {
        moviesRepository.save(movies);
    }
}
