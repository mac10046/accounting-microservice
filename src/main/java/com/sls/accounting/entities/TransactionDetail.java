package com.sls.accounting.entities;

import jakarta.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "AccountID")
    private Account account;

    @Column(name = "DebitAmount")
    private Double debitAmount;

    @Column(name = "CreditAmount")
    private Double creditAmount;


}
