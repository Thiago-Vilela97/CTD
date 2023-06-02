package com.catalog.service;

import com.catalog.entity.CatalogEntity;

import java.util.List;

public interface ICatalogService {
    List<CatalogEntity> findByGenero(String genero);
    List<CatalogEntity> findAll();
}
