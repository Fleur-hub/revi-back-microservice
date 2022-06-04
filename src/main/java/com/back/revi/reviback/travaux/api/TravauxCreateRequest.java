package com.back.revi.reviback.travaux.api;

import com.back.revi.reviback.travaux.model.TravauxType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
public class TravauxCreateRequest implements Serializable {
	@Schema(required = true)
	private final Long housingId;
	@Schema(required = true)
	private final TravauxType travauxType;
}
