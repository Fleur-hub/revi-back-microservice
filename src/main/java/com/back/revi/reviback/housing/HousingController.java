package com.back.revi.reviback.housing;

import com.back.revi.reviback.user.User;
import com.back.revi.reviback.user.UserDto;
import com.back.revi.reviback.user.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/housing")
@Tag(name = "housing", description = "The housings API.")
@AllArgsConstructor
@NoArgsConstructor
public class HousingController {

	
	private HousingService housingService;

	
	private UserService userService;

	@Operation(summary = "create a housing.", tags = {"housing"})
	@ApiResponses(value = {
			@ApiResponse(
					responseCode = "201",
					description = "Successful operation",
					content = @Content(schema = @Schema(implementation = HousingDto.class))
			)
	})
	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	ResponseEntity<HousingDto> createHousing(@Valid @RequestBody HousingCreateRequest request){
		Optional<User> user = userService.findByEmail(request.getUserMail());
		Housing housing = Housing.builder()
								 .user(user.get())
								 .adress(request.getAdress())
								 .typeLogement(request.getTypeLogement())
								 .copropriete(request.isCopropriete())
								 .superfice(request.getSuperfice())
								 .dateConstruction(request.getDateConstruction())
								 .budget(request.getBudget())
								 .build();

		return ResponseEntity.ok(HousingDto.createFromHousing(housingService.save(housing)));
	}
}
