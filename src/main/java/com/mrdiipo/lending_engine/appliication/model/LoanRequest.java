package com.mrdiipo.lending_engine.appliication.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class LoanRequest {

    private final int amount;
    private final String borrowerId;
    private final int daysToRepay;
    private final double interestRate;

    public LoanRequest(int amount, String borrowerId, int daysToRepay, double interestRate) {
        this.amount = amount;
        this.borrowerId = borrowerId;
        this.daysToRepay = daysToRepay;
        this.interestRate = interestRate;
    }
}
