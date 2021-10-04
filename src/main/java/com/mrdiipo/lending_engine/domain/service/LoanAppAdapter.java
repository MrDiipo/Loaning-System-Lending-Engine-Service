package com.mrdiipo.lending_engine.domain.service;

import com.mrdiipo.lending_engine.domain.repository.UserRepository;
import com.mrdiipo.lending_engine.appliication.model.LoanRequest;
import com.mrdiipo.lending_engine.domain.exception.UserNotFound;
import com.mrdiipo.lending_engine.domain.model.LoanApplication;
import com.mrdiipo.lending_engine.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LoanAppAdapter {

    private final UserRepository userRepository;

    @Autowired
    public LoanAppAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoanApplication transform(LoanRequest request, User borrower){
        Optional<User> userOptional = userRepository.findById(borrower.getUsername());

        if (userOptional.isPresent()){
            return new LoanApplication(request.getAmount(), userOptional.get(), request.getDaysToRepay(), request.getInterestRate());
        } else {
            throw new UserNotFound(borrower.getUsername());
        }
    }
}
