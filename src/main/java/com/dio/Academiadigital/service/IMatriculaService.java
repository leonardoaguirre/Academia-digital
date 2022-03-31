package com.dio.Academiadigital.service;

import com.dio.Academiadigital.model.DTO.MatriculaForm;
import com.dio.Academiadigital.model.Matricula;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
