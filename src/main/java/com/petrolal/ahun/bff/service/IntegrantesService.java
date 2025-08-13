package com.petrolal.ahun.bff.service;

import org.springframework.stereotype.Service;

import com.petrolal.ahun.bff.client.IntegrantesClient;
import com.petrolal.ahun.bff.dto.IntegrantesDto;

@Service
public class IntegrantesService {

	private final IntegrantesClient integrantesClient;

	public IntegrantesService(IntegrantesClient integrantesClient) {
		this.integrantesClient = integrantesClient;
	}

	public IntegrantesDto fetchIntegrantes() {
		return this.integrantesClient.getAllIntegrantes();
	}

}
