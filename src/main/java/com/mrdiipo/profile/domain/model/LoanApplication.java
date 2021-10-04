package com.mrdiipo.profile.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.Duration;

@EqualsAndHashCode
@ToString
@Data
@Entity
public final class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private final int amount;
    private final User borrower;
    private final Duration repaymentTerm;
    private final double interestRate;

    public LoanApplication(Long id, int amount, User borrower, Duration repaymentTerm, double interestRate) {
        this.id = id;
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTerm = repaymentTerm;
        this.interestRate = interestRate;
    }

    public LoanApplication() {

    }
}
