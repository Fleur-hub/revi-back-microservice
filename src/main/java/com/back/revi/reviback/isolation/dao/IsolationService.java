package com.back.revi.reviback.isolation.dao;

import com.back.revi.reviback.isolation.model.Isolation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Service
public class IsolationService {
	private IsolationRepository isolationRepository;

	public Isolation save(Isolation isolation) {
		return isolationRepository.save(isolation);
	}
}
