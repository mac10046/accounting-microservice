package com.sls.accounting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Table(name = "TransactionDetail")
public class TransactionDetail {

    @Id
    private Long transactionDetailId;

    @ManyToOne
    @JoinColumn(name = "TransactionID")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "AccountID")
    private Account account;

    @Column(name = "DebitAmount")
    private Double debitAmount;

    @Column(name = "CreditAmount")
    private Double creditAmount;


}
