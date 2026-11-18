package br.edu.fiec.provap2_cinema.model.entity;

import br.edu.fiec.provap2_cinema.model.dto.FilmeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Filme")
public class FilmeEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private Integer duracaoEmMinutos;

    @Column(nullable = false)
    private String classificacao;

    public FilmeEntity (FilmeDTO filmeDTO) {

        setTitulo(filmeDTO.getTitulo());
        setGenero(filmeDTO.getGenero());
        setDuracaoEmMinutos(filmeDTO.getDuracaoEmMinutos());
        setClassificacao(filmeDTO.getClassificacao());
    }
}
