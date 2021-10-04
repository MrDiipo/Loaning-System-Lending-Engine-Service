package com.mrdiipo.lending_engine.domain.repository;

import com.mrdiipo.lending_engine.domain.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
}
