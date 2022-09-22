package com.example.Aula22MVC.service.trainer.impl;

import com.example.Aula22MVC.model.Trainer;
import com.example.Aula22MVC.service.trainer.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }

}
