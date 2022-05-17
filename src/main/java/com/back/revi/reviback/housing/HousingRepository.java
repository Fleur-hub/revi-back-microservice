package com.back.revi.reviback.housing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingRepository extends JpaRepository<Housing, Long> {

}
