package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    private final MoviesService moviesService;

    public  MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping
    public List<Movies> getMovies(){
        return moviesService.all();
    }

    @PostMapping
    public void addMovies(@RequestBody Movies movies) {
        moviesService.add(movies);
    }
}
