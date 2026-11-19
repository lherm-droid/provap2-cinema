package br.edu.fiec.provap2_cinema.model.entity;

import br.edu.fiec.provap2_cinema.model.dto.IngressoDTO;
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
    private Integer sessaoId;

    @Column(nullable = false)
    private Double preco;


    public IngressoEntity(IngressoDTO ingressoDTO) {
        setNome(ingressoDTO.getNome());
        setSessaoId(ingressoDTO.getSessaoId());
        setPreco(ingressoDTO.getPreco());
    }
}
