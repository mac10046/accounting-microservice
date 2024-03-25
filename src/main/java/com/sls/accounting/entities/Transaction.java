package com.sls.accounting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    private Long transactionId;

    @NotNull
    private Organization organization;

    @NotNull
    private Date transactionDate;

    private String transactionDescription;

    @NotNull
    private Double transactionAmount;

}
