package com.example.rewards.model;

import jakarta.persistence.*;
import java.time.*;
/** Represents a purchase transaction used for reward calculation. */
@Entity
public class Transaction {
	@Id
	@GeneratedValue
	private Long id;
	private Double amount;
	private LocalDate transactionDate;
	@ManyToOne
	private Customer customer;

	public Transaction() {
	}

	public Transaction(Double a, LocalDate d, Customer c) {
		amount = a;
		transactionDate = d;
		customer = c;
	}

	public Double getAmount() {
		return amount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public Customer getCustomer() {
		return customer;
	}
}
