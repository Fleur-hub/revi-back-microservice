package com.back.revi.reviback.housing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class HousingService {
	private HousingRepository housingRepository;

	public Housing save(Housing housing){
		return housingRepository.save(housing);
	}

	public Optional<Housing> findById(Long id) {
		return housingRepository.findById(id);
	}
}
