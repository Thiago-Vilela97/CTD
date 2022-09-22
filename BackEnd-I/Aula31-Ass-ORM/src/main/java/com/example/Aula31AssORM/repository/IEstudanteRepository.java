package com.example.Aula31AssORM.repository;

import com.example.Aula31AssORM.entity.EstudanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudanteRepository extends JpaRepository<EstudanteEntity, Long > {
}
