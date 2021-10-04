package com.mrdiipo.profile.appliication;

import com.mrdiipo.profile.domain.model.LoanRequest;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @PostMapping("/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanRequest){
        System.out.println(loanRequest);
    }
}
