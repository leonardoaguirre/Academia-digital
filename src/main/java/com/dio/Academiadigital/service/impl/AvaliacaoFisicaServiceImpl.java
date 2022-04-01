package com.dio.Academiadigital.service.impl;

import com.dio.Academiadigital.model.Aluno;
import com.dio.Academiadigital.model.AvaliacaoFisica;
import com.dio.Academiadigital.model.DTO.AvaliacaoFisicaForm;
import com.dio.Academiadigital.model.DTO.AvaliacaoFisicaUpdateForm;
import com.dio.Academiadigital.repository.AlunoRepository;
import com.dio.Academiadigital.repository.AvaliacaoFisicaRepository;
import com.dio.Academiadigital.service.IAvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {

        Optional<Aluno> aluno = alunoRepository.findById(form.getAlunoId());

        AvaliacaoFisica AF = new AvaliacaoFisica();
        AF.setAltura(form.getAltura());
        AF.setPeso(form.getPeso());
        AF.setAluno(aluno.get());
        return avaliacaoFisicaRepository.save(AF);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
