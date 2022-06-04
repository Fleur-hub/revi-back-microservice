package com.back.revi.reviback.ventilation.dao;

import com.back.revi.reviback.ventilation.model.Ventilation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Service
public class VentilationService {
	private VentilationRepository ventilationRepository;

	public Ventilation save(Ventilation ventilation) {
		return ventilationRepository.save(ventilation);
	}
}
