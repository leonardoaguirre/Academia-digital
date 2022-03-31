package com.dio.Academiadigital.model;

import java.time.LocalDateTime;

public class AvaliacaoFisica {
    private Long id;
    private Aluno aluno;
    private LocalDateTime dataAvaliacao = LocalDateTime.now();
    private Double peso;
    private Double altura;
}
