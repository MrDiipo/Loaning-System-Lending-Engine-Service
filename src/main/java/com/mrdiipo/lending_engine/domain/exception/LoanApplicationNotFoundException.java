package com.mrdiipo.lending_engine.domain.exception;

public class LoanApplicationNotFoundException extends RuntimeException{
    public LoanApplicationNotFoundException(long loanApplicationId) {
        super("Loan application with id: " + loanApplicationId + " was not found") ;
    }
}
