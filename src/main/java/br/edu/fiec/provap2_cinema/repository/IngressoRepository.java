package br.edu.fiec.provap2_cinema.repository;

import br.edu.fiec.provap2_cinema.model.entity.IngressoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngressoRepository extends JpaRepository<IngressoEntity, Integer> {

    List<IngressoEntity> findAllByNome(String nome);

    List<IngressoEntity> findAllByFilmeContains(String filme);
}
