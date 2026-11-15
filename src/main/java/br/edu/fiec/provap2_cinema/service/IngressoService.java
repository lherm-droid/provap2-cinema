package br.edu.fiec.provap2_cinema.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import br.edu.fiec.provap2_cinema.model.Ingresso;


@Service
public class IngressoService {

    private final List<Ingresso> ingressoList = new ArrayList<>();

    public void addIngresso (Ingresso ingresso) {
        this.ingressoList.add(ingresso);
    }

}
