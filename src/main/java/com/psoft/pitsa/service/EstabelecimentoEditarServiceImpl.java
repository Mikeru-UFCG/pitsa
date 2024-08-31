package com.psoft.pitsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psoft.pitsa.dto.EstabelecimentoPostPutRequestDTO;
import com.psoft.pitsa.model.Estabelecimento;
import com.psoft.pitsa.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoEditarServiceImpl implements EstabelecimentoEditarService {

    @Autowired
    private EstabelecimentoRepository repository;

    @Override
    public Estabelecimento editarEstabelecimento(EstabelecimentoPostPutRequestDTO estabelecimentoPostPutRequestDTO) {
        String nome = estabelecimentoPostPutRequestDTO.getNome();
        String cod = estabelecimentoPostPutRequestDTO.getCodigoAcesso();
        Estabelecimento e = Estabelecimento.builder()
            .nome(nome)
            .codigoAcesso(cod)
            .build();
        return repository.save(e);
    }
    
}
