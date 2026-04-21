package com.example.rewards.config;

import com.example.rewards.model.Customer;
import com.example.rewards.model.Transaction;
import com.example.rewards.repository.TransactionRepository;
import com.example.rewards.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

/**
 * Loads sample customers and transactions into the H2 database.
 * Data covers multiple customers, months, and edge cases.
 */
@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadSampleData(
            CustomerRepository customerRepository,
            TransactionRepository transactionRepository) {

        return args -> {

            // Customers
            Customer john = customerRepository.save(new Customer(1L, "John Doe"));
            Customer alice = customerRepository.save(new Customer(2L, "Alice Smith"));
            Customer bob = customerRepository.save(new Customer(3L, "Bob Miller"));

            // John Doe Transactions
            transactionRepository.save(
                new Transaction(120.0, LocalDate.of(2026, 1, 10), john));
            transactionRepository.save(
                new Transaction(75.0, LocalDate.of(2026, 1, 20), john));
            transactionRepository.save(
                new Transaction(200.0, LocalDate.of(2026, 2, 15), john));
            transactionRepository.save(
                new Transaction(40.0, LocalDate.of(2026, 3, 5), john));

            // Alice Smith Transactions
            transactionRepository.save(
                new Transaction(100.0, LocalDate.of(2026, 1, 12), alice));
            transactionRepository.save(
                new Transaction(150.0, LocalDate.of(2026, 2, 5), alice));
            transactionRepository.save(
                new Transaction(90.0, LocalDate.of(2026, 2, 22), alice));
            transactionRepository.save(
                new Transaction(110.0, LocalDate.of(2026, 3, 8), alice));

            // Bob Miller (Edge Cases)
            transactionRepository.save(
                new Transaction(49.0, LocalDate.of(2026, 1, 5), bob));
            transactionRepository.save(
                new Transaction(50.0, LocalDate.of(2026, 2, 10), bob));
            transactionRepository.save(
                new Transaction(51.0, LocalDate.of(2026, 3, 18), bob));
        };
    }
}