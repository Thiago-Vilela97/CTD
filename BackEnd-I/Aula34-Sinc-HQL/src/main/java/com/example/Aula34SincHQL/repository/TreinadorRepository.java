package com.example.Aula34SincHQL.repository;

import com.example.Aula34SincHQL.model.TreinadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TreinadorRepository extends JpaRepository<TreinadorModel, Long> {

    @Query("SELECT treinador t FROM tb_treinador WHERE t.idade = ?1")
    Optional<TreinadorModel> findTreinadorByAge(Integer age);
}
