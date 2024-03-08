package com.sls.accounting.repositories;

import com.sls.accounting.entities.Account;
import com.sls.accounting.entities.Transaction;
import com.sls.accounting.entities.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Integer> {

    Optional<TransactionDetail> findByTransactionDetailId(int transactionDetailId);

    List<TransactionDetail> findByTransaction(Transaction transaction);

    List<TransactionDetail> findByAccount(Account account);

}
