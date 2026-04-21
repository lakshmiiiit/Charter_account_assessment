package com.example.rewards.exception;

/**
 * Thrown when a transaction amount is invalid.
 */
public class InvalidTransactionException extends RuntimeException {

    public InvalidTransactionException(String message) {
        super(message);
    }
}