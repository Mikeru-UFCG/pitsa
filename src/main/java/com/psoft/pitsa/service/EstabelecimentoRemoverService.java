package com.psoft.pitsa.service;

import com.psoft.pitsa.dto.EstabelecimentoPostPutRequestDTO;

@FunctionalInterface
public interface EstabelecimentoRemoverService {
    
    void removerEstabelecimento(EstabelecimentoPostPutRequestDTO estabelecimentoPostPutRequestDTO);
    
}