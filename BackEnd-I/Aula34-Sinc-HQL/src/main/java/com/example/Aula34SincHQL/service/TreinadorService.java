package com.example.Aula34SincHQL.service;

import com.example.Aula34SincHQL.model.TreinadorModel;
import com.example.Aula34SincHQL.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinadorService {

    private TreinadorRepository treinadorRepository;

    @Autowired
    public TreinadorService(TreinadorRepository treinadorRepository){
        this.treinadorRepository = treinadorRepository;
    }

    public List<TreinadorModel> buscarTodos() {
        return treinadorRepository.findAll();
    }

    public TreinadorModel BuscarPorIdade(Integer idade) {
        return treinadorRepository.findTreinadorByAge(idade).get();
    }
}
