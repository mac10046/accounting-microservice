package com.sls.accounting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    private Long transactionId;

    private Date transactionDate;

    private String transactionDescription;

    private Double transactionAmount;

}
