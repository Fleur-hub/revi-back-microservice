package com.back.revi.reviback.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserCreateRequest {
	@Schema(required = true)
	private String email;
	@Schema(required = true)
	private UserRole userRole;
	@Schema(required = true)
	private String username;
	@Schema(required = true)
	private String firstName;
	@Schema(required = true)
	private String lastName;
	@Schema(required = true)
	private String phoneNumber;
	@Schema(required = true)
	private Long housingId;
}
