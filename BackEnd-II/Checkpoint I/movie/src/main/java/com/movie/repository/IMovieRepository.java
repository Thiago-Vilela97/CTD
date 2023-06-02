package com.movie.repository;

import com.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {
    List<MovieEntity> findByGenero(String genero);
}
