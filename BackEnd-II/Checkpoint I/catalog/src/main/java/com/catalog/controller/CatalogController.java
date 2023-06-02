package com.catalog.controller;

import com.catalog.entity.CatalogEntity;
import com.catalog.service.impl.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl catalogService;

    @GetMapping("/{genero}")
    public List<CatalogEntity> findByGenero(@PathVariable String genero) {
        List<CatalogEntity> catalogEntityList = catalogService.findByGenero(genero);
        return catalogEntityList;
    }
    @GetMapping()
    public List<CatalogEntity> findAll() {
        return catalogService.findAll();
    }
}
