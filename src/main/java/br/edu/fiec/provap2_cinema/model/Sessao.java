package br.edu.fiec.provap2_cinema.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sessao {

    private Long id;

    private Filme filme;

    private Sala sala;

    private String dataHora;

    private Double preco;

    private Enum status;

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
