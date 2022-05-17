package com.back.revi.reviback.housing;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HousingDto {

	private String userMail;
	private String adress;
	private LogementType typeLogement;
	private boolean copropriete;
	private int superfice;
	private DateConstruction dateConstruction;
	private int budget;

	public static HousingDto createFromHousing(Housing housing) {
		return HousingDto.builder()
						 .userMail(housing.getUser().getEmail())
						 .adress(housing.getAdress())
						 .typeLogement(housing.getTypeLogement())
						 .copropriete(housing.isCopropriete())
						 .dateConstruction(housing.getDateConstruction())
						 .superfice(housing.getSuperfice())
						 .budget(housing.getBudget())
						 .build();
	}
}
