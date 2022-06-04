package com.back.revi.reviback.chauffeeau.dao;

import com.back.revi.reviback.chauffeeau.model.ChauffeEau;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ChauffeEauService {

	private ChauffeEauRepository chauffeEauRepository;

	public ChauffeEau save(ChauffeEau chauffeEau) {
		return chauffeEauRepository.save(chauffeEau);
	}

	public Optional<ChauffeEau> findById(long id) {
		return chauffeEauRepository.findById(id);
	}
}
