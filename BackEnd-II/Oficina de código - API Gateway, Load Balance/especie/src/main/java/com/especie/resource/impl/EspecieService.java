package com.especie.resource.impl;

import com.especie.entity.EspecieEntity;
import com.especie.repository.IEspecieRepository;
import com.especie.resource.IEspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecieService implements IEspecieService<EspecieEntity> {

    @Autowired
    private IEspecieRepository iEspecieRepository;

    @Override
    public List<EspecieEntity> findAll() { return iEspecieRepository.findAll();}
    @Override
    public Optional<EspecieEntity> findById(Integer id) {
        return iEspecieRepository.findById(id);
    }
    @Override
    public EspecieEntity adicionar(EspecieEntity especieEntity) {
        if(especieEntity !=null) {
            return iEspecieRepository.save(especieEntity);
        }
        return new EspecieEntity();
    }
    @Override
    public String deletar(Integer id) {
        if(iEspecieRepository.findById(id).isPresent()) {
            iEspecieRepository.deleteById(id);
            return "Especie apagada";
        }
        return "Especie não encontrada!";
    }
    @Override
    public String atualizar(EspecieEntity especieEntity) {
        if(especieEntity != null && iEspecieRepository.findById(especieEntity.getId()).isPresent()) {
            iEspecieRepository.saveAndFlush(especieEntity);
            return "Especie atualizado";
        }
        return "Não foi possível localizar esse Especie!";
    }
}
