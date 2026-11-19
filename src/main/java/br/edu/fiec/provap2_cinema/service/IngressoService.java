package br.edu.fiec.provap2_cinema.service;

import br.edu.fiec.provap2_cinema.model.dto.IngressoDTO;
import br.edu.fiec.provap2_cinema.model.entity.IngressoEntity;
import br.edu.fiec.provap2_cinema.model.entity.SessaoEntity;
import br.edu.fiec.provap2_cinema.repository.IngressoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IngressoService {

    private final IngressoRepository ingressoRepository;


    public void createIngresso(IngressoDTO ingressoDTO){ingressoRepository.save(new IngressoEntity(ingressoDTO));}

    public List<IngressoEntity> getAllIngressos(){return ingressoRepository.findAll();}

    public IngressoEntity getIngressoById(Integer id){return ingressoRepository.findById(id).orElse(null);}

    public List<IngressoEntity> getAllByNome(String nome) {return ingressoRepository.findAllByNome(nome);}

    public List<IngressoEntity> getAllBySessao(SessaoEntity sessao) {return ingressoRepository.findAllBySessaoContains(sessao);}

    public void updateIngressoById(Integer id, IngressoDTO ingressoDTO) {
        IngressoEntity ingressoEntity = ingressoRepository.findById(id).orElse(null);

        if (ingressoEntity != null) {
            ingressoEntity.setNome(ingressoDTO.getNome());
            ingressoEntity.setSessaoId(ingressoDTO.getSessaoId());
            ingressoEntity.setPreco(ingressoDTO.getPreco());

            ingressoRepository.save(ingressoEntity);
        }
    }

    public void deleteIngressoById(Integer id) {ingressoRepository.deleteById(id);}







}
