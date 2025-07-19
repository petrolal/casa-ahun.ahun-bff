package br.com.casaahun.ahunbff.model.dto;


import br.com.casaahun.ahunbff.model.enums.CargoEnum;
import br.com.casaahun.ahunbff.model.enums.IntegranteStatusEnum;

import java.util.Date;

public record IntegrantesDto(String nm_integrante, IntegranteStatusEnum st_ativo, CargoEnum nm_cargo,
                             Date dt_aniversario) {
}
