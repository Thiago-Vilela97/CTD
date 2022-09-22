package com.example.Aula30_InjecaoDependencia.service.impl;

import com.example.Aula30_InjecaoDependencia.dto.LivroDTO;
import com.example.Aula30_InjecaoDependencia.entity.LivroEntity;
import com.example.Aula30_InjecaoDependencia.repository.ILivroRepository;
import com.example.Aula30_InjecaoDependencia.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements ILivroService {

    @Autowired
    private ILivroRepository livroRepository;

    @Override
    public List<LivroDTO> buscarTodosLivros() {
        List<LivroDTO> response;
        List<LivroEntity> livroEntityList = this.livroRepository.buscarTodosLivros();

        response = livroEntityList.stream().map(LivroDTO::new).collect(Collectors.toList());
        return response;
    }
}
