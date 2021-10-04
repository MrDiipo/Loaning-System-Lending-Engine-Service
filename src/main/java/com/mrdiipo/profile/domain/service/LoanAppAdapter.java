package com.mrdiipo.profile.domain.service;

import com.mrdiipo.profile.appliication.LoanRequest;
import com.mrdiipo.profile.domain.exception.UserNotFound;
import com.mrdiipo.profile.domain.model.LoanApplication;
import com.mrdiipo.profile.domain.model.User;
import com.mrdiipo.profile.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Optional;

@Component
public class LoanAppAdapter {

    private final   UserRepository userRepository;

    @Autowired
    public LoanAppAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoanApplication transform(LoanRequest request){
        Optional<User> userOptional = userRepository.findById(request.getBorrowerId());

        if (userOptional.isPresent()){
            return new LoanApplication(request.getAmount(), userOptional.get(), Duration.ofDays(request.getDaysToRepay()), request.getInterestRate());
        } else {
            throw new UserNotFound(request.getBorrowerId());
        }
    }
}
