package com.back.revi.reviback.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Tag(name = "user", description = "The users API.")
public class UserController {
	@Autowired
	private UserService userService;

	@Operation(summary = "create a user.", tags = {"user"})
	@ApiResponses(value = {
			@ApiResponse(
					responseCode = "201",
					description = "Successful operation",
					content = @Content(schema = @Schema(implementation = UserDto.class))
			)
	})
	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	ResponseEntity<UserDto> createUser(@Valid @RequestBody UserCreateRequest request) {
		User user = User.builder()
						.email(request.getEmail())
						.userRole(request.getUserRole())
						.username(request.getUsername())
						.firstName(request.getFirstName())
						.lastName(request.getLastName())
						.phoneNumber(request.getPhoneNumber())
						.build();

		return ResponseEntity.ok(UserDto.createFromUser(userService.save(user)));
	}
}