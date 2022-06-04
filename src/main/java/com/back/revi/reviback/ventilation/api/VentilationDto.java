package com.back.revi.reviback.ventilation.api;

import com.back.revi.reviback.ventilation.model.TypeVMC;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
public class VentilationDto implements Serializable {
	@Schema(required = true)
	private final Long ventilationId;
	@Schema(required = true)
	private final Long travauxId;
	@Schema(required = true)
	private final TypeVMC typeVMC;
	@Schema(required = true)
	private final Long nombreVMC;
}
