package br.edu.fiec.provap2_cinema.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sala {

    private Long id;

    private String nome;

    private Integer numero;

    private Integer quantidadeFileiras;

    private Integer assentosPorFileira;

    private Integer capacidade;

    // <>-------<< ENTRADA DE DADOS ESPERADA (-Exemplo-) >>-------<>

    /*

    {
        id                      : 01                                    ;
        titulo                  : "exemplo"                             ;
        sinopse                 : "esse é o melhor exemplo de todos!"   ;
        genero                  : "acao"                                ;
        duracaoMinutos          : 90                                    ;
        classificacaoIndicativa : "16+"                                 ;
        ativo                   : true                                  ;
    }

    */

}
