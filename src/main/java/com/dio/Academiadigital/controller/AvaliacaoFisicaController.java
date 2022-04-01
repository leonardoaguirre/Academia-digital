package com.dio.Academiadigital.controller;

import com.dio.Academiadigital.model.AvaliacaoFisica;
import com.dio.Academiadigital.model.DTO.AvaliacaoFisicaForm;
import com.dio.Academiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return avaliacaoFisicaService.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaService.create(form);
    }
}
