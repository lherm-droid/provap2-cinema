package br.edu.fiec.provap2_cinema.controller;

import br.edu.fiec.provap2_cinema.model.entity.FilmeEntity;
import br.edu.fiec.provap2_cinema.service.FilmeService;
import br.edu.fiec.provap2_cinema.model.dto.FilmeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping(value = "filme")
public class FilmeController {

        private final FilmeService filmeService;

        @ResponseStatus(HttpStatus.OK)
        @PostMapping(consumes = APPLICATION_JSON_VALUE)
        public void createFilme(@RequestBody FilmeDTO filmeDTO) {
            filmeService.createFilme(filmeDTO);
        }

        @ResponseStatus(HttpStatus.OK)
        @GetMapping(value = "all", consumes = APPLICATION_JSON_VALUE)
        public List<FilmeEntity> getAllFilmes() {return filmeService.getAllFilmes();}

        @ResponseStatus(HttpStatus.OK)
        @GetMapping(value = "/{id}", consumes = APPLICATION_JSON_VALUE)
        public FilmeEntity findFilmeById(@RequestParam Integer id) {
            return filmeService.getFilmeById(id);
        }

        @ResponseStatus(HttpStatus.OK)
        @GetMapping(value = "/titulo", consumes = APPLICATION_JSON_VALUE)
        public List<FilmeEntity> findAllFilmeByTitulo(@RequestParam String titulo) {
            return filmeService.findAllByTitulo(titulo);
        }

        @ResponseStatus(HttpStatus.OK)
        @GetMapping(value = "/genero", consumes = APPLICATION_JSON_VALUE)
        public List<FilmeEntity> findAllFilmeByGenero(@RequestParam String genero) {
            return filmeService.findAllByGenero(genero);
        }

        @ResponseStatus(HttpStatus.OK)
        @PutMapping(value = "/id", consumes = APPLICATION_JSON_VALUE)
        public void uptadeFilmeById(
                @RequestParam Integer id,
                @RequestBody FilmeDTO filmeDTO
        ) { filmeService.updateFilmeById(id, filmeDTO);
        }

        @ResponseStatus(HttpStatus.OK)
        @DeleteMapping( value = "/{id}")
                public void deleteFilmeById(@RequestParam Integer id) {
            filmeService.deleteFilmeById(id);
        }



}
