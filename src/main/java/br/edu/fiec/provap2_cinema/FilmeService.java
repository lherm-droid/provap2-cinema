package br.edu.fiec.provap2_cinema;

import br.edu.fiec.provap2_cinema.model.dto.FilmeDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;


    public void createFilme(FilmeDTO filmeDTO) {
        filmeRepository.save(new FilmeEntity(filmeDTO));
    }

    public List<FilmeEntity> getAllFilmes() {
        return filmeRepository.findAll();
    }

    public FilmeEntity getFilmeById(Integer id) {
        return filmeRepository.findById(id).orElse(null);
    }

    public List<FilmeEntity> findAllByTitulo(String titulo) {
        return filmeRepository.findAllByTituloContains(titulo);
    }

    public List<FilmeEntity> findAllByGenero(String genero) {
        return filmeRepository.findAllByGenero(genero);
    }

    public void updateFilmeById (Integer id, FilmeDTO filmeDTO) {
        FilmeEntity filmeEntity = filmeRepository.findById(id).orElse(null);

        if (filmeEntity != null) {
            filmeEntity.setTitulo(filmeDTO.getTitulo());
            filmeEntity.setGenero(filmeDTO.getGenero());
            filmeEntity.setDuracaoEmMinutos(filmeDTO.getDuracaoEmMinutos());
            filmeEntity.setClassificacao(filmeDTO.getClassificacao());
        }
    }

    public void deleteFilmeById (Integer id) {
        filmeRepository.deleteById(id);
    }
}
