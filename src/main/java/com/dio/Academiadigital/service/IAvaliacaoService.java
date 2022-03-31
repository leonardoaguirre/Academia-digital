package com.dio.Academiadigital.service;

import com.dio.Academiadigital.model.AvaliacaoFisica;
import com.dio.Academiadigital.model.DTO.AvaliacaoFisicaForm;
import com.dio.Academiadigital.model.DTO.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
