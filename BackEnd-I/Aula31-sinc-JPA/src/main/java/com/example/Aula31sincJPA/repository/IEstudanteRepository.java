package com.example.Aula31sincJPA.repository;


import com.example.Aula31sincJPA.entity.EstudanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudanteRepository extends JpaRepository<EstudanteEntity, Long> {
}
