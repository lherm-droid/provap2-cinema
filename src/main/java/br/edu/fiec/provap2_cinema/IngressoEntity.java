package br.edu.fiec.provap2_cinema;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Ingresso")
public class IngressoEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String filme;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private String hora;

    public IngressoEntity(IngressoDTO ingressoDTO) {
        setNome(ingressoDTO.getNome());
        setFilme(ingressoDTO.getFilme());
        setPreco(ingressoDTO.getPreco());
        setHora(ingressoDTO.getHora());
    }
}
