package com.back.revi.reviback.housing;

import com.back.revi.reviback.user.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Set;

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
