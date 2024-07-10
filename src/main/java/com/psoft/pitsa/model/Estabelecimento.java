package com.psoft.pitsa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Estabelecimento {

    private String nome;
    private String codigoAcesso;
    
}
