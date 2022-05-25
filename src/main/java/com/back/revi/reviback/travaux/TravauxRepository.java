package com.back.revi.reviback.travaux;

import com.back.revi.reviback.housing.Housing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravauxRepository extends JpaRepository<Travaux, Long> {

	public List<Travaux> findAllByHousing(Housing housing);
}