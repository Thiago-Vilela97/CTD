package com.catalog.service;

import com.catalog.entity.CatalogEntity;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("MOVIE-SERVICE")
@LoadBalancerClient(value = "MOVIE-SERVICE")
public interface IMovieClient {

    @GetMapping("/movie/{genero}")
    List<CatalogEntity> findByGenero(@PathVariable String genero);
    @GetMapping("/movie")
    List<CatalogEntity> findAll();
}
