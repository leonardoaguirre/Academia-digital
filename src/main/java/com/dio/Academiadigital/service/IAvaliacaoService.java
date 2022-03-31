package com.dio.Academiadigital.service;

import com.dio.Academiadigital.model.AvaliacaoFisica;

import java.util.List;

public interface IAvaliacaoService {
    AvaliacaoFisica create(AvaliacaoForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
