package com.dio.Academiadigital.service;

import com.dio.Academiadigital.model.Aluno;
import com.dio.Academiadigital.model.DTO.AlunoForm;
import com.dio.Academiadigital.model.DTO.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);
}
