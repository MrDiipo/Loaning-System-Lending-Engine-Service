package com.mrdiipo.lending_engine.appliication.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class LoanRequest {

    private final int amount;
    private final int daysToRepay;
    private final double interestRate;

    public LoanRequest(int amount, int daysToRepay, double interestRate) {
        this.amount = amount;
        this.daysToRepay = daysToRepay;
        this.interestRate = interestRate;
    }
}
