package com.example.archive.service;

import com.example.archive.model.Movies;
import com.example.archive.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

    //список всех касет
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    //поиск касеты по ID
    public Movies getMoviesById(Long id) {
        return moviesRepository.findById(id).orElse(null);
    }

    //поиск кассеты по ключевым словам
    public List<Movies> searchMovies(String keyword) {
        return moviesRepository.searchByKeyword(keyword);
    }
    //Добавление кассеты
    public Movies addMovie(Movies movies) {
        return moviesRepository.save(movies);
    }
    //Редактирование кассеты
    public Movies updateMovie(Long id, Movies moviesDetails) {
        Movies movies = moviesRepository.findById(id).orElse(null);
        if (movies != null) {
            movies.setMedia(moviesDetails.getMedia());
            movies.setMediaType(moviesDetails.getMediaType());
            movies.setSource(moviesDetails.getSource());
            movies.setDateAdded(moviesDetails.getDateAdded());
            movies.setOriginalTitle(moviesDetails.getOriginalTitle());
            movies.setYear(moviesDetails.getYear());
            movies.setDirector(moviesDetails.getDirector());
            movies.setDescription(moviesDetails.getDescription());
            movies.setComments(moviesDetails.getComments());

            return moviesRepository.save(movies);
        }
        return null;
    }
}
