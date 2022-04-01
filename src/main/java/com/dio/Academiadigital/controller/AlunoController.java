package com.dio.Academiadigital.controller;

import com.dio.Academiadigital.model.Aluno;
import com.dio.Academiadigital.model.AvaliacaoFisica;
import com.dio.Academiadigital.model.DTO.AlunoForm;
import com.dio.Academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @GetMapping
    public List<Aluno> getAll(){
        return alunoService.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return alunoService.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacoesFisicas(@PathVariable Long id){
        return alunoService.getAllAvaliacaoFisica(id);
    }
}
