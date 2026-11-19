package br.edu.fiec.provap2_cinema.repository;

import br.edu.fiec.provap2_cinema.model.entity.FilmeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeEntity, Integer> {

    List<FilmeEntity> findAllByTituloContains(String titulo);

    List<FilmeEntity> findAllByGenero(String genero);

}
