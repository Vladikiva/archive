package com.example.archive.repository;

import com.example.archive.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//добавление и поиск
public interface MoviesRepository extends JpaRepository<Movies, Long> {

    @Query(value = "SELECT * FROM movies WHERE " +
            "media LIKE %:keyword% OR " +
            "mediatype LIKE %:keyword% OR " +
            "source LIKE %:keyword% OR " +
            "originalTitle LIKE %:keyword% OR " +
            "director LIKE %:keyword% OR " +
            "description LIKE %:keyword% OR " +
            "comments LIKE %:keyword%", nativeQuery = true)
    List<Movies> searchByKeyword(@Param("keyword") String keyword);
}
