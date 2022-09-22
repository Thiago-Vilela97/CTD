package com.example.Aula31sincJPA.controller;

import com.example.Aula31sincJPA.entity.EstudanteEntity;
import com.example.Aula31sincJPA.service.impl.EstudanteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstudanteController {

    private final EstudanteServiceImpl estudanteService;

    public EstudanteController(EstudanteServiceImpl estudanteService) {
        this.estudanteService = estudanteService;
    }
    @RequestMapping(value = "/estudantes", method = RequestMethod.GET, produces = "application/json")
    public List<EstudanteEntity> buscarTodosEstudantes() {
        return estudanteService.findAllEstudantes();
    }

    @GetMapping("/estudante/{id}")
    public Optional<EstudanteEntity> buscarEstudantePorId(@PathVariable Long id) {
        return estudanteService.findEstudanteById(id);
    }

    @PostMapping("/estudante/adicionar")
    public EstudanteEntity adicionarEstudante(@RequestBody EstudanteEntity estudanteEntity) {
        return estudanteService.addEstudante(estudanteEntity);
    }
    @DeleteMapping("/estudante/delete/{id}")
    public String deleteEstudante(@PathVariable Long id) {
        return estudanteService.deleteEstudante(id);
    }

    @PutMapping("/estudante/atualizar")
    public String atualizarEstudante(@RequestBody EstudanteEntity estudanteEntity) {
        return estudanteService.updateEstudante(estudanteEntity);
    }
}
