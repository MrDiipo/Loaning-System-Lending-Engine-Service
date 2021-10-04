package com.mrdiipo.profile.appliication;

import com.mrdiipo.profile.domain.model.LoanApplication;
import com.mrdiipo.profile.domain.repository.LoanRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanRequestRepository loanRequestRepository;

    @Autowired
    public LoanController(LoanRequestRepository loanRequestRepository) {
        this.loanRequestRepository = loanRequestRepository;
    }


    @PostMapping("/loan/request")
    public void requestLoan(@RequestBody final LoanApplication loanRequest){
        System.out.println(loanRequest);
    }
}
