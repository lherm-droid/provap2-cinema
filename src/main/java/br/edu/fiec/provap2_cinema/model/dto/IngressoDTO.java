package br.edu.fiec.provap2_cinema.model.dto;

import br.edu.fiec.provap2_cinema.model.entity.SessaoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngressoDTO {


    private String nome;

    private Integer sessaoId;

    private Double preco;


}
