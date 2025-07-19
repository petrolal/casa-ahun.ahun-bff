package br.com.casaahun.ahunbff.controller;

import br.com.casaahun.ahunbff.client.IntegrantesClient;
import br.com.casaahun.ahunbff.model.dto.IntegrantesDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/integrantes")
@Tag(name = "Integrantes", description = "Endpoints de membros da Casa Ahun")
public class IntegrantesController {

    private final IntegrantesClient integrantesClient;

    public IntegrantesController(IntegrantesClient integrantesClient) {
        this.integrantesClient = integrantesClient;
    }

    @Operation(summary = "Listar todos os integrantes")
    @GetMapping()
    public List<IntegrantesDto> listar() {
        return integrantesClient.listarTodos();
    }

    @Operation(summary = "Buscar membro por ID")
    @GetMapping("/{id}")
    public IntegrantesDto buscarPorId(@PathVariable Integer id) {
        return integrantesClient.buscarPorId(id);
    }

}
