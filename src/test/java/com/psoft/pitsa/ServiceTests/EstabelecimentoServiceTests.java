package com.psoft.pitsa.ServiceTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EstabelecimentoServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {

    }

    @Test
    @DisplayName("Teste para criar estabelecimento com código correto.")
    public void CriarEstabelecimentoComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para criar estabelecimento com código incorreto.")
    public void CriarEstabelecimentoComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para editar estabelecimento com código correto.")
    public void EditarEstabelecimentoComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para editar estabelecimento com código incorreto.")
    public void EditarEstabelecimentoComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para remover estabelecimento com código correto.")
    public void RemoverEstabelecimentoComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para remover estabelecimento com código incorreto.")
    public void RemoverEstabelecimentoComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para estabelecimento ler cliente com código correto.")
    public void EstabelecimentoLerClienteComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para estabelecimento ler cliente com código incorreto.")
    public void EstabelecimentoLerClienteComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

}
