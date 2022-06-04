package com.back.revi.reviback.isolation.api;

import com.back.revi.reviback.isolation.model.IsolationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
public class IsolationDto implements Serializable {
	@Schema(required = true)
	private final Long isolationId;
	@Schema(required = true)
	private final long travauxId;
	@Schema(required = true)
	private final IsolationType isolationType;
	@Schema(required = true)
	private final Long surface;
	@Schema(required = true)
	private final Long nbJointCalfeutrage;
}
