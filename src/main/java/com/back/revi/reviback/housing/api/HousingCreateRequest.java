package com.back.revi.reviback.housing.api;

import com.back.revi.reviback.housing.model.DateConstruction;
import com.back.revi.reviback.housing.model.LogementType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
public class HousingCreateRequest {
	@Schema(required = true)
	private String userMail;
	@Schema(required = true)
	private String adress;
	@Schema(required = true)
	private LogementType typeLogement;
	@Schema(required = true)
	private boolean copropriete;
	@Schema(required = true)
	private int superfice;
	@Schema(required = true)
	private DateConstruction dateConstruction;
	@Schema(required = true)
	private int budget;
}
