package com.movie.controller;

import com.movie.entity.MovieEntity;
import com.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
@CrossOrigin(origins = "*")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieEntity> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<MovieEntity>> findById(@PathVariable Integer id) {
        return movieService.findById(id);
    }

    @GetMapping("/{genero}")
    public List<MovieEntity> findByGenero(@PathVariable String genero) {
        return movieService.findByGenero(genero);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody MovieEntity movie) {
        if (movie != null) {
            return new ResponseEntity<>(movieService.add(movie), HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @PutMapping
    public ResponseEntity<Optional<MovieEntity>> atualizar (@RequestBody MovieEntity movie) {
        if (movie != null){
            return ResponseEntity.ok(movieService.atualizar(movie)) ;
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar (@PathVariable Integer id) {
        return movieService.deletar(id);
    }

}
