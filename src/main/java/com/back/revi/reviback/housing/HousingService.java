package com.back.revi.reviback.housing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HousingService {
	@Autowired
	private HousingRepository housingRepository;

	public Housing save(Housing housing){
		return housingRepository.save(housing);
	}
}
