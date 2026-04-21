package com.example.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rewards.model.Transaction;
import java.util.*;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByCustomer_Id(Long customerId);
}