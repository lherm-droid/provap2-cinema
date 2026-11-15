package br.edu.fiec.provap2_cinema.model;


import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingresso {

    private Long id;

    private String codigo;

    private String nomeCliente;

    private String emailCliente;

    private Sessao sessao;

    private List assentos;

    private Double valorTotal;

    private String dataCriacao;

    private String status;

    // <>-------<< ENTRADA DE DADOS ESPERADA (-Exemplo-) >>-------<>

    /*

    {
        id          : 01                     ;
        codigo      : "1A2B3C4D"             ;
        nomeCliente : "Marília"              ;
        emailCliente: "miraiNikki@gmail.com" ;
        sessao      :                        ;
        assentos    :                    ;
        valorTotal  :                        ;
        dataCriacao :                        ;
        status      :                        ;
    }

    */

}
