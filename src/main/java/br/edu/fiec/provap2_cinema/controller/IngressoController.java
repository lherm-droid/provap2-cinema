package br.edu.fiec.provap2_cinema.controller;

import br.edu.fiec.provap2_cinema.model.dto.IngressoDTO;
import br.edu.fiec.provap2_cinema.model.entity.IngressoEntity;
import br.edu.fiec.provap2_cinema.model.entity.SessaoEntity;
import br.edu.fiec.provap2_cinema.service.IngressoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@AllArgsConstructor
public class IngressoController {

    private final IngressoService ingressoService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createIngresso(@RequestParam IngressoDTO ingressoDTO) {
        ingressoService.createIngresso(ingressoDTO);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<IngressoEntity> findAllIngressos() {
        return ingressoService.getAllIngressos();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value="/{id}", produces = APPLICATION_JSON_VALUE)
    public IngressoEntity findIngressoById(@RequestParam Integer id) {
        return ingressoService.getIngressoById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value="/nome", produces = APPLICATION_JSON_VALUE)
    public List<IngressoEntity> findIngressoByNome(@RequestParam String nome) {
        return ingressoService.getAllByNome(nome);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value="/filme", produces = APPLICATION_JSON_VALUE)
    public List<IngressoEntity> findIngressoBySessao(@RequestParam SessaoEntity sessao) {
        return ingressoService.getAllBySessao(sessao);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping(value="/id", produces = APPLICATION_JSON_VALUE)
    public void uptadeIngressoById(@RequestParam  Integer id,
                                   @RequestBody IngressoDTO ingressoDTO) {
        ingressoService.updateIngressoById(id, ingressoDTO);

    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = "{id}")
    public void deleteIngressoById(@RequestParam Integer id) {
        ingressoService.deleteIngressoById(id);
    }
}
