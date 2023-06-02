package com.especie.controller;

import com.especie.resource.impl.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/especie")
public class EspecieController {

    @Autowired
    private EspecieService especieService;

}
