package com.back.revi.reviback.chauffeeau.api;

import com.back.revi.reviback.chauffeeau.model.ChauffeEauType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class ChauffeEauCreateRequest implements Serializable {
	@Schema(required = true)
	private final long travauxId;
	@NotBlank
	@Schema(required = true)
	private final ChauffeEauType chauffeEauType;
}
