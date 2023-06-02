package com.catalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogEntity {
    private Integer id;
    private String nome;
    private String genero;
    private String urlStream;
}
