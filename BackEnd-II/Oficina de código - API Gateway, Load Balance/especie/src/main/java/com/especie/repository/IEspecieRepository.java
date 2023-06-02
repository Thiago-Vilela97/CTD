package com.especie.repository;


import com.especie.entity.EspecieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEspecieRepository extends JpaRepository<EspecieEntity, Integer> {
}
