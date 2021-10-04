package com.mrdiipo.profile.domain.repository;

import com.mrdiipo.profile.domain.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanRequestRepository extends JpaRepository<LoanApplication, Long> {
}
