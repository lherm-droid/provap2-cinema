package br.edu.fiec.provap2_cinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingresso {

    private Integer id;

    private String nome;

    private String filme;

    private Double preco;
}
