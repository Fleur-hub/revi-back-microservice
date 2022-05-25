package com.back.revi.reviback.travaux;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TravauxService {
	private TravauxRepository travauxRepository;

	public Travaux save(Travaux travaux) {
		return travauxRepository.save(travaux);
	}
}
