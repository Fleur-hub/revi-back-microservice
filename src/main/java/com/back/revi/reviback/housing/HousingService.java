package com.back.revi.reviback.housing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class HousingService {
	private HousingRepository housingRepository;

	public Housing save(Housing housing){
		return housingRepository.save(housing);
	}
}
