package com.mrdiipo.profile.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Duration;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public final class LoanRequest {

    private final int amount;
    private final User borrower;
    private final Duration repaymentTerm;
    private final double intrestRate;

    public LoanRequest(int amount, User borrower, Duration repaymentTerm, double intrestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTerm = repaymentTerm;
        this.intrestRate = intrestRate;
    }

}
