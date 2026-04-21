package com.example.rewards.exception;

/**
 * Thrown when a customer does not exist in the system.
 */
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(Long customerId) {
        super("Customer not found with id: " + customerId);
    }
}
