package com.back.revi.reviback.travaux.dao;

import com.back.revi.reviback.housing.model.Housing;
import com.back.revi.reviback.travaux.model.Travaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravauxRepository extends JpaRepository<Travaux, Long> {

	List<Travaux> findAllByHousing(Housing housing);
}