package com.example.rewards.repository;

import com.example.rewards.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/** Repository for Customer entity. */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
