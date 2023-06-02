package com.movie.service;

import com.movie.entity.MovieEntity;
import com.movie.repository.IMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final IMovieRepository movieRepository;

    public List<MovieEntity> findAll(){
        return movieRepository.findAll();
    }

    public List<MovieEntity> findByGenero(String genero) {
        List<MovieEntity> movieEntityList;
        movieEntityList = movieRepository.findByGenero(genero);
        if(movieEntityList != null) return movieEntityList;
        return null;
    }

    public ResponseEntity<Optional<MovieEntity>> findById(Integer id) {
        Optional<MovieEntity> movie = movieRepository.findById(id);
        if(movie.isPresent()) {
            return new ResponseEntity<>(movie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public MovieEntity add(MovieEntity movie) {
        if(movie != null) {
            return movieRepository.save(movie);
        }
        return new MovieEntity();
    }

    public ResponseEntity<String> deletar(Integer id) {
        if(movieRepository.findById(id).isPresent()) {
            movieRepository.deleteById(id);
            return ResponseEntity.ok().body("filme apagado!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("filme não encontrado!");
    }

    public Optional<MovieEntity> atualizar (MovieEntity movie) {
        if (movie != null && movieRepository.findById(movie.getId()).isPresent()) {
            return Optional.of(movieRepository.saveAndFlush(movie));
        } else {
            return null;
        }
    }
}
