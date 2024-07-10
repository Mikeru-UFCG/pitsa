package com.psoft.pitsa.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EstabelecimentoPostPutRequestDTO {

    private String nome;
    private String codigoAcesso;
    
}
