package com.mrdiipo.lending_engine.appliication;

import com.mrdiipo.lending_engine.appliication.model.LoanRequest;
import com.mrdiipo.lending_engine.domain.model.LoanApplication;
import com.mrdiipo.lending_engine.domain.model.service.TokenValidationService;
import com.mrdiipo.lending_engine.domain.repository.LoanApplicationRepository;
import com.mrdiipo.lending_engine.domain.repository.UserRepository;
import com.mrdiipo.lending_engine.domain.service.LoanAppAdapter;
import com.mrdiipo.lending_engine.domain.model.User;
import com.mrdiipo.lending_engine.domain.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class LoanController {

    private final LoanApplicationRepository loanApplicationRepository;
    private final UserRepository userRepository;
    private final LoanAppAdapter loanAppAdapter;
    private final LoanService loanService;
    private final TokenValidationService tokenValidationService;

    @Autowired
    public LoanController(LoanApplicationRepository loanApplicationRepository, UserRepository userRepository, LoanAppAdapter loanAppAdapter, LoanService loanService, TokenValidationService tokenValidationService) {
        this.loanApplicationRepository = loanApplicationRepository;
        this.userRepository = userRepository;
        this.loanAppAdapter = loanAppAdapter;
        this.loanService = loanService;
        this.tokenValidationService = tokenValidationService;
    }

/**Post Mappings*/

    @PostMapping("/loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanRequest, HttpServletRequest request) {
        tokenValidationService.validateTokenAndGetUser(request.getHeader(HttpHeaders.AUTHORIZATION));
        LoanApplication loanApplication = loanAppAdapter.transform(loanRequest);
        loanApplicationRepository.save(loanApplication);
    }

    @PostMapping("/loan/accept/{lenderId}/{loanApplicationId}")
    public void acceptLoan(@PathVariable final String lenderId,
                           @PathVariable final String loanApplicationId,
                           HttpServletRequest request){
        tokenValidationService.validateTokenAndGetUser(request.getHeader(HttpHeaders.AUTHORIZATION));
        loanService.acceptLoan(Long.parseLong(loanApplicationId), lenderId);

    }


/**Get Mappings*/

    @GetMapping("/users")
    public List<User> findUsers(HttpServletRequest request) {
        tokenValidationService.validateTokenAndGetUser(request.getHeader(HttpHeaders.AUTHORIZATION));
        return userRepository.findAll();
    }

    @GetMapping("/loan/requests")
    public List<LoanApplication> findAllLoanApplication(HttpServletRequest request){
        tokenValidationService.validateTokenAndGetUser(request.getHeader(HttpHeaders.AUTHORIZATION));
        return loanApplicationRepository.findAll();
    }
}
