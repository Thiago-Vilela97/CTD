package com.catalog.service.impl;

import com.catalog.entity.CatalogEntity;
import com.catalog.service.ICatalogService;
import com.catalog.service.IMovieClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements ICatalogService {
    @Autowired
    private IMovieClient iMovieClient;

    @Override
    public List<CatalogEntity> findByGenero(String genero) {
        List<CatalogEntity> catalogEntities;
        catalogEntities = iMovieClient.findByGenero(genero);
        if(catalogEntities != null) return catalogEntities;
        return null;
    }

    @Override
    public List<CatalogEntity> findAll() {
        return iMovieClient.findAll();
    }
}
