package com.back.revi.reviback.isolation.dao;

import com.back.revi.reviback.isolation.model.Isolation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsolationRepository extends JpaRepository<Isolation, Long> {
}
