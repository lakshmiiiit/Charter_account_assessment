package com.example.rewards.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration test for rewards REST API.
 */
@SpringBootTest
@AutoConfigureMockMvc
class RewardControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnRewardsForCustomer() throws Exception {

        mockMvc.perform(get("/api/rewards/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.2026-01").exists())
                .andExpect(jsonPath("$.2026-02").exists())
                .andExpect(jsonPath("$.2026-03").exists());
    }

    @Test
    void shouldReturnEmptyForNonExistingCustomer() throws Exception {

        mockMvc.perform(get("/api/rewards/999"))
                .andExpect(status().isOk());
    }
}
