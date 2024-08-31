package com.psoft.pitsa.service;

import com.psoft.pitsa.dto.EstabelecimentoPostPutRequestDTO;
import com.psoft.pitsa.model.Estabelecimento;

@FunctionalInterface
public interface EstabelecimentoEditarService {

    Estabelecimento editarEstabelecimento(EstabelecimentoPostPutRequestDTO estabelecimentoPostPutRequestDTO);
    
}