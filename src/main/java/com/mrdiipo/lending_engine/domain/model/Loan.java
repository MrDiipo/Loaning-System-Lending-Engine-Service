package com.mrdiipo.lending_engine.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private User borrower;
    private User lender;
    private int amount;
    private double interestRate;
    private LocalDate dateLent;
    private LocalDate dateDue;

    public Loan(User lender, LoanApplication loanApplication) {
        this.lender = lender;
        this.borrower = loanApplication.getBorrower();
        this.amount = loanApplication.getAmount();
        this.interestRate = loanApplication.getInterestRate();
        this.dateLent = LocalDate.now();
        this.dateDue = LocalDate.now().plusDays(loanApplication.getRepaymentTermInDays());
    }
}
