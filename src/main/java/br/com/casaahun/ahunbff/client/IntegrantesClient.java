package br.com.casaahun.ahunbff.client;

import br.com.casaahun.ahunbff.model.dto.IntegrantesDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ahun-integrantes", url = "${integracoes.integrantes}")
public interface IntegrantesClient {

    @GetMapping("/integrantes")
    List<IntegrantesDto> listarTodos();

    @GetMapping("/integrantes/{id}")
    IntegrantesDto buscarPorId(@PathVariable Integer id);

}
