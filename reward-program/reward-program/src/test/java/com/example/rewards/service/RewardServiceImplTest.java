package com.example.rewards.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for reward point calculation logic.
 */
class RewardServiceImplTest {

    private final RewardServiceImpl service =
            new RewardServiceImpl(null);

    @Test
    void shouldReturnZeroPointsBelow50() {
        assertEquals(0, service.points(40));
    }

    @Test
    void shouldReturnPointsBetween50And100() {
        assertEquals(25, service.points(75));
    }

    @Test
    void shouldReturnPointsAbove100() {
        assertEquals(90, service.points(120));
    }

    @Test
    void shouldHandleBoundaryValues() {
        assertEquals(0, service.points(50));
        assertEquals(50, service.points(100));
    }
}
