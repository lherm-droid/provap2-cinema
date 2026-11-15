package br.edu.fiec.provap2_cinema.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeEntity {

    private Long id;

    private String titulo;

    private String sinopse;

    private String genero;

    private Integer duracaoMinutos;

    private String classificacaoIndicativa;

    private Boolean ativo;

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
