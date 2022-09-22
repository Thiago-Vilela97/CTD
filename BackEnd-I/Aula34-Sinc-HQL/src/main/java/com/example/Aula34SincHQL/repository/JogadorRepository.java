package com.example.Aula34SincHQL.repository;

import com.example.Aula34SincHQL.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {

    @Query("SELECT jogador j FROM tb_jogador WHERE j.nome = ?1")
    Optional<JogadorModel> findJogadorByName(String name);//?1 -> vai pegar exatamente o nome que será passado no
    //findJogadorByName
}
