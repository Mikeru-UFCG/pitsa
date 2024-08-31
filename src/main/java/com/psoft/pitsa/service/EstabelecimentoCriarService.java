package com.psoft.pitsa.service;

import com.psoft.pitsa.dto.EstabelecimentoPostPutRequestDTO;
import com.psoft.pitsa.model.Estabelecimento;

@FunctionalInterface
public interface EstabelecimentoCriarService {

    Estabelecimento criarEstabelecimento(EstabelecimentoPostPutRequestDTO estabelecimentoPostPutRequestDTO);

}