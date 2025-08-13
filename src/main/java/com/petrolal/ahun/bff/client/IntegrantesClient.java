package com.petrolal.ahun.bff.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.petrolal.ahun.bff.dto.IntegrantesDto;

@FeignClient(name = "ahun-integrantes", url = "${integracao.ahun-integrantes.url}")
public interface IntegrantesClient {

	@GetMapping("/integrantes")
	IntegrantesDto getAllIntegrantes();

}
