package com.back.revi.reviback.chauffage.dao;

import com.back.revi.reviback.chauffage.model.Chauffage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class ChauffageService {
	private ChauffageRepository chauffageRepository;

	public Chauffage save(Chauffage chauffage) {
		return chauffageRepository.save(chauffage);
	}
}
