package com.psoft.pitsa.TestesFuncionais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ClienteCRUDTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
    }

    @Test
    @DisplayName("Teste para criar cliente com código correto.")
    public void CriarClienteComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para criar cliente com código incorreto.")
    public void CriarClienteComCodigoIncorretoTest() throws Exception {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para editar cliente com código correto.")
    public void EditarClienteComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para editar cliente com código incorreto.")
    public void EditarClienteComCodigoIncorretoTest() throws Exception {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para remover cliente com código correto.")
    public void RemoverClienteComCodigoCorretoTest() {
        // Arrange:
        // Act:
        // Assert:
    }

    @Test
    @DisplayName("Teste para remover cliente com código incorreto.")
    public void RemoverClienteComCodigoIncorretoTest() throws Exception {
        // Arrange:
        // Act:
        // Assert:
    }
    
}
