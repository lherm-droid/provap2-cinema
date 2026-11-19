package br.edu.fiec.provap2_cinema.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeDTO {

    private String titulo;

    private String genero;

    private Integer duracaoEmMinutos;

    private String classificacao;
}
