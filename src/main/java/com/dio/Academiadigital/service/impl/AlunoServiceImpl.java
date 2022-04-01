package com.dio.Academiadigital.service.impl;

import com.dio.Academiadigital.model.Aluno;
import com.dio.Academiadigital.model.AvaliacaoFisica;
import com.dio.Academiadigital.model.DTO.AlunoForm;
import com.dio.Academiadigital.model.DTO.AlunoUpdateForm;
import com.dio.Academiadigital.repository.AlunoRepository;
import com.dio.Academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setBairro(form.getBairro());
        aluno.setCpf(form.getCpf());
        aluno.setDataNascimento(form.getDataNascmento());

        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        return alunoRepository.findById(id).get().getAvaliacoes();
    }
}
