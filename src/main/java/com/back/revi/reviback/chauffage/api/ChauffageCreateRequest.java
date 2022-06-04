package com.back.revi.reviback.chauffage.api;

import com.back.revi.reviback.chauffage.model.ChauffegeType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChauffageCreateRequest implements Serializable {
	@Schema(required = true)
	private final long travauxId;
	@Schema(required = true)
	private final ChauffegeType chauffegeType;
	@Schema(required = true)
	private final Long surface;
	@Schema(required = true)
	private final Long nombreRadiateur;
}
