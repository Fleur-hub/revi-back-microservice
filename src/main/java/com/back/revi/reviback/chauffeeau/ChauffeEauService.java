package com.back.revi.reviback.chauffeeau;

import com.back.revi.reviback.housing.Housing;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ChauffeEauService {
	
	private ChauffeEauRepository chauffeEauRepository;

	public ChauffeEau save(ChauffeEau chauffeEau){
		return chauffeEauRepository.save(chauffeEau);
	}

	public ChauffeEau findByHousing(Housing housing){
		return chauffeEauRepository.findByHousing(housing.getId());
	}

	public Optional<ChauffeEau> findById(long id){
		return chauffeEauRepository.findById(id);
	}
}
