package com.example.Aula30_InjecaoDependencia.repository.impl;

import com.example.Aula30_InjecaoDependencia.entity.LivroEntity;
import com.example.Aula30_InjecaoDependencia.repository.ILivroRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class LivroRepositoryImpl implements ILivroRepository {

    @Override
    public List<LivroEntity> buscarTodosLivros() {
        List<LivroEntity> livroEntityList = new ArrayList<>();
        livroEntityList.add(new LivroEntity(1,"Clean code", "Robert C. Martin"));
        livroEntityList.add(new LivroEntity(2,"Marley & Eu", "John Grogan"));

        return livroEntityList;
    }
}
