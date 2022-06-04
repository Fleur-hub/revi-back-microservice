package com.back.revi.reviback.chauffage.dao;

import com.back.revi.reviback.chauffage.model.Chauffage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChauffageRepository extends JpaRepository<Chauffage, Long> {
}
