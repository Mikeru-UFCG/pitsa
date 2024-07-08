package com.psoft.pitsa.TestesFuncionais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EntregadorServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
    }

    @Test
    @DisplayName("Teste para criar entregador com código correto.")
    public void CriarEntregadorComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para criar entregador com código incorreto.")
    public void CriarEntregadorComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para editar entregador com código correto.")
    public void EditarEntregadorComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para editar entregador com código incorreto.")
    public void EditarEntregadorComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para remover entregador com código correto.")
    public void RemoverEntregadorComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para remover entregador com código incorreto.")
    public void RemoverEntregadorComCodigoIncorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }
    
}
