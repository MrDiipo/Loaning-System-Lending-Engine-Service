package com.mrdiipo.lending_engine.domain.service;

import com.mrdiipo.lending_engine.domain.exception.LoanApplicationNotFoundException;
import com.mrdiipo.lending_engine.domain.exception.UserNotFound;
import com.mrdiipo.lending_engine.domain.model.LoanApplication;
import com.mrdiipo.lending_engine.domain.model.User;
import com.mrdiipo.lending_engine.domain.repository.LoanApplicationRepository;
import com.mrdiipo.lending_engine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanApplicationRepository loanApplicationRepository;
    private final UserRepository userRepository;
    private final LoanAppAdapter loanAppAdapter;

    @Autowired
    public LoanService(LoanApplicationRepository loanApplicationRepository,
                       UserRepository userRepository,
                       LoanAppAdapter loanAppAdapter) {
        this.loanApplicationRepository = loanApplicationRepository;
        this.userRepository = userRepository;
        this.loanAppAdapter = loanAppAdapter;
    }

    public void acceptLoan(final long loanApplicationId, final String  lenderId){

        User lender = userRepository.findById(lenderId).orElseThrow(() -> new UserNotFound(lenderId));

        LoanApplication loanApplication = loanApplicationRepository.findById(loanApplicationId)
                .orElseThrow(() -> new LoanApplicationNotFoundException(loanApplicationId));
    }
}
