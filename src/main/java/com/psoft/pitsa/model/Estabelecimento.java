package com.psoft.pitsa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@Entity
@Table(name = "estabelecimentos")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String codigoAcesso;

    // Construtor adicional
    public Estabelecimento(Long id, String nome, String codigoAcesso) {
        this.id = id;
        this.nome = nome;
        this.codigoAcesso = codigoAcesso;
    }
}
