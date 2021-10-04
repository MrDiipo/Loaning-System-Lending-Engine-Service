package com.mrdiipo.lending_engine.domain.repository;

import com.mrdiipo.lending_engine.domain.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long>{

}
