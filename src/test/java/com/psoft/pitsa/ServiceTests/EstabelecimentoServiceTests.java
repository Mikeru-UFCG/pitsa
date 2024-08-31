package com.psoft.pitsa.ServiceTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.psoft.pitsa.dto.EstabelecimentoPostPutRequestDTO;
import com.psoft.pitsa.model.Estabelecimento;
import com.psoft.pitsa.repository.EstabelecimentoRepository;
import com.psoft.pitsa.service.EstabelecimentoCriarService;
import com.psoft.pitsa.service.EstabelecimentoEditarService;
import com.psoft.pitsa.service.EstabelecimentoRemoverService;

@SpringBootTest
@DisplayName("Testes para service do CRUD de estabelecimentos.")
public class EstabelecimentoServiceTests {

    @Autowired
    EstabelecimentoCriarService cdriver;

    @Autowired
    EstabelecimentoEditarService edriver;

    @Autowired
    EstabelecimentoRemoverService rdriver;

    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    Estabelecimento estabelecimento;

    EstabelecimentoPostPutRequestDTO estabelecimentoPostPutRequestDTO;

    @BeforeEach
    void setup() {
        estabelecimento = Estabelecimento.builder()
                .nome("Giraffas")
                .codigoAcesso("123456")
                .build();
        estabelecimentoPostPutRequestDTO = EstabelecimentoPostPutRequestDTO.builder()
                .nome("Giraffas")
                .codigoAcesso("123456")
                .build();
    }

    @AfterEach
    void tearDown() {
        estabelecimentoRepository.deleteAll();
    }


    @Test
    @DisplayName("Teste para criar estabelecimento com código correto.")
    public void CriarEstabelecimentoComCodigoCorretoTest() throws Exception {
        // Arrange:
        estabelecimentoRepository.save(estabelecimento);

        // Act:
        Estabelecimento result = cdriver.criarEstabelecimento(estabelecimentoPostPutRequestDTO);

        // Assert:
        assertNotNull(result);
        assertEquals(estabelecimentoPostPutRequestDTO.getNome(), result.getNome());
        assertEquals(estabelecimentoPostPutRequestDTO.getCodigoAcesso(), result.getCodigoAcesso());
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
