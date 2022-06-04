package com.back.revi.reviback.ventilation.dao;

import com.back.revi.reviback.ventilation.model.Ventilation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentilationRepository extends JpaRepository<Ventilation, Long> {
}
