package com.sls.accounting.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Account")
public class Account {

    @Id
    private Long accountId;

    private String accountName;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private Double balance = 0d;

    public enum AccountType {
        Asset, Liability, Equity, Revenue, Expense
    }
}
