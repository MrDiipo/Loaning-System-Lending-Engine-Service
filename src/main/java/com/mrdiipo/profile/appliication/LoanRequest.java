package com.mrdiipo.profile.appliication;

import com.mrdiipo.profile.domain.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.Duration;

@Data
@EqualsAndHashCode
@ToString
public class LoanRequest {

    private final int amount;
    private final Long borrowerId;
    private final Duration daysToRepay;
    private final double interestRate;

    public LoanRequest(int amount, Long borrowerId, Duration daysToRepay, double interestRate) {
        this.amount = amount;
        this.borrowerId = borrowerId;
        this.daysToRepay = daysToRepay;
        this.interestRate = interestRate;
    }
}
