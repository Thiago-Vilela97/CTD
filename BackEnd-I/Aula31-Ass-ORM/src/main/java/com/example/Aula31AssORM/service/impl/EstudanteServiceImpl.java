package com.example.Aula31AssORM.service.impl;

import com.example.Aula31AssORM.entity.EstudanteEntity;
import com.example.Aula31AssORM.repository.IEstudanteRepository;
import com.example.Aula31AssORM.service.IEstudanteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteServiceImpl implements IEstudanteService<EstudanteEntity> {

    private final IEstudanteRepository estudanteRepository;

    public EstudanteServiceImpl(IEstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    @Override
    public List<EstudanteEntity> findAllEstudantes() {
        return estudanteRepository.findAll();
    }

    @Override
    public Optional<EstudanteEntity> findEstudantesById(Long id) {
        return estudanteRepository.findById(id);
    }

    @Override
    public EstudanteEntity addEstudante(EstudanteEntity estudanteEntity) {
        if(estudanteEntity !=null) {
            return estudanteRepository.save(estudanteEntity);
        }
        return new EstudanteEntity();
    }

    @Override
    public String deleteEstudantes(Long id) {
        if(estudanteRepository.findById(id).isPresent()) {
            estudanteRepository.deleteById(id);
            return "Estudante apagado";
        }
        return "Estudante não encontrado!";
    }

    @Override
    public String updateEstudante(EstudanteEntity estudanteEntity) {
        if(estudanteEntity != null && estudanteRepository.findById(estudanteEntity.getId()).isPresent()) {
            estudanteRepository.saveAndFlush(estudanteEntity);
            return "Estudante atualizado";
        }
        return "Não foi possível localizar esse estudante!";
    }
}
