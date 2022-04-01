package com.dio.Academiadigital.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaForm {
    private Long alunoId;
    private Double peso;
    private Double altura;
}
