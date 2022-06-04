package com.back.revi.reviback.chauffeeau.dao;

import com.back.revi.reviback.chauffeeau.model.ChauffeEau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChauffeEauRepository extends JpaRepository<ChauffeEau, Long> {
	//ChauffeEau findByHousing(Long housingId);
}
