package com.mrdiipo.profile.appliication;

import com.mrdiipo.profile.domain.model.LoanApplication;
import com.mrdiipo.profile.domain.model.User;
import com.mrdiipo.profile.domain.repository.LoanRequestRepository;
import com.mrdiipo.profile.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    private final LoanRequestRepository loanRequestRepository;
    private final UserRepository userRepository;

    @Autowired
    public LoanController(LoanRequestRepository loanRequestRepository, UserRepository userRepository) {
        this.loanRequestRepository = loanRequestRepository;
        this.userRepository = userRepository;
    }


    @PostMapping("/loan/request")
    public void requestLoan(@RequestBody final LoanApplication loanRequest) {
        System.out.println(loanRequest);
    }

    @GetMapping("/users")
    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
