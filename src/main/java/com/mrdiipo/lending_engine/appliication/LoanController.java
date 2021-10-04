package com.mrdiipo.lending_engine.appliication;

import com.mrdiipo.lending_engine.appliication.model.LoanRequest;
import com.mrdiipo.lending_engine.domain.model.LoanApplication;
import com.mrdiipo.lending_engine.domain.repository.LoanApplicationRepository;
import com.mrdiipo.lending_engine.domain.repository.UserRepository;
import com.mrdiipo.lending_engine.domain.service.LoanAppAdapter;
import com.mrdiipo.lending_engine.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {

    private final LoanApplicationRepository loanApplicationRepository;
    private final UserRepository userRepository;
    private final LoanAppAdapter loanAppAdapter;

    @Autowired
    public LoanController(LoanApplicationRepository loanApplicationRepository, UserRepository userRepository, LoanAppAdapter loanAppAdapter) {
        this.loanApplicationRepository = loanApplicationRepository;
        this.userRepository = userRepository;
        this.loanAppAdapter = loanAppAdapter;
    }


    @PostMapping("/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanRequest) {
        LoanApplication loanApplication = loanAppAdapter.transform(loanRequest);
        loanApplicationRepository.save(loanApplication);
    }

    @PostMapping("/loan/accept/{lenderId}/{loanApplicationId}")
    public void acceptLoan(@PathVariable final String lenderId,
                           @PathVariable final String loanApplicationId){

    }

    @GetMapping("/users")
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/loan/requests")
    public List<LoanApplication> findAllLoanApplication(){
        return loanApplicationRepository.findAll();
    }
}
