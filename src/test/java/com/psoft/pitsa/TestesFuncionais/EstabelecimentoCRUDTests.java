package com.psoft.pitsa.TestesFuncionais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EstabelecimentoCRUDTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private Estabelecimento estabelecimento;

    @BeforeEach
    public void setUp() {
        estabelecimento = new Estabelecimento("123456", "Loja 1");

    }

    @Test
    @DisplayName("Teste para criar estabelecimento com código correto.")
    public void CriarEstabelecimentoComCodigoCorretoTest() {
        // Arrenge:
        // Act & Assert:
        mockMvc.perform(post("/estabelecimentos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estabelecimento)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nome").value("Loja 1"))
                .andExpect(jsonPath("$.codigoAcesso").value("123456"));
    }

    @Test
    @DisplayName("Teste para criar estabelecimento com código incorreto.")
    public void CriarEstabelecimentoComCodigoIncorretoTest() throws Exception {
        // Arrange:
        // Act & Assert:
        mockMvc.perform(post("/estabelecimentos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estabelecimento)))
                .andExpect(status().isForbidden());
    }

    @Test
    @DisplayName("Teste para editar estabelecimento com código correto.")
    public void EditarEstabelecimentoComCodigoCorretoTest() {
        // Arrange:
        // Act & Assert
        mockMvc.perform(post("/estabelecimentos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estabelecimento)))
                .andExpect(status().isCreated());

        estabelecimento.setNome("Loja 2");

        mockMvc.perform(put("/estabelecimentos/123456")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estabelecimento)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Loja 2"));
    }

    @Test
    @DisplayName("Teste para editar estabelecimento com código incorreto.")
    public void EditarEstabelecimentoComCodigoIncorretoTest() throws Exception {
        // Arrange:
        // Act:
        // Assert:
        // Act & Assert
        mockMvc.perform(post("/estabelecimentos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estabelecimento)))
                .andExpect(status().isCreated());

        estabelecimento.setNome("Loja 2");

        mockMvc.perform(put("/estabelecimentos/654321")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(estabelecimento)))
                .andExpect(status().isForbidden());
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
    public void RemoverEstabelecimentoComCodigoIncorretoTest() throws Exception {
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
    public void EstabelecimentoLerClienteComCodigoIncorretoTest() throws Exception {
        // Arrange:
        // Act:
        // Assert:
    }

}
