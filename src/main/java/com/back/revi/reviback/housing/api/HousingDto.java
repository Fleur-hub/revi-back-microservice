package com.back.revi.reviback.housing.api;

import com.back.revi.reviback.housing.model.Housing;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HousingDto {

	private long id;

	public static HousingDto createFromHousing(Housing housing) {
		return HousingDto.builder()
						 .id(housing.getId())
						 .build();
	}
}
