package com.example.archive.controller;

import com.example.archive.model.Movies;
import com.example.archive.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/archive")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    //список всех кассет
    @GetMapping("/all")
    public List<Movies> getAllMovies() {
        return moviesService.getAllMovies();
    }

    //добавление кассеты
    @PostMapping
    public Movies addMovie(@RequestBody Movies movies) {
        return moviesService.addMovie(movies);
    }

    //редактирование кассеты
    @PutMapping("/{id}")
    public ResponseEntity<Movies> updateMovie(@PathVariable Long id, @RequestBody Movies moviesDetails) {
        Movies updateMovie = moviesService.updateMovie(id, moviesDetails);
        if (updateMovie != null) {
            return ResponseEntity.ok(updateMovie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //поиск кассеты по ID
    @GetMapping("/{id}")
    public Movies getMoviesById(@PathVariable Long id) {
        return moviesService.getMoviesById(id);
    }

    //поиск кассеты по ключевым словам
    private static final Logger logger = Logger.getLogger(MoviesController.class.getName());

    @GetMapping("/search")
    public List<Movies> searchMovies(@RequestParam String keyword) {
        return moviesService.searchMovies(keyword);
    }
}
