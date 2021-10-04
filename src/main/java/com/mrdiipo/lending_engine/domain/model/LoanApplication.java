package com.mrdiipo.lending_engine.domain.model;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode
@ToString
@Data
@Entity
public final class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private int amount;

    @ManyToOne
    private User borrower;

    private int repaymentTermInDays;
    private  double interestRate;

    public LoanApplication(int amount, User borrower, int repaymentTermInDays, double interestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTermInDays = repaymentTermInDays;
        this.interestRate = interestRate;
    }

    public LoanApplication() {

    }


}
