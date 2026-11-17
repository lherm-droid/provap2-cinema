package br.edu.fiec.provap2_cinema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngressoDTO {


    private String nome;


    private String filme;

    private Double preco;

    private String hora;
}
