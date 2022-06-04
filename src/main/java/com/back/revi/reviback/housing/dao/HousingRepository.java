package com.back.revi.reviback.housing.dao;

import com.back.revi.reviback.housing.model.Housing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingRepository extends JpaRepository<Housing, Long> {

}
