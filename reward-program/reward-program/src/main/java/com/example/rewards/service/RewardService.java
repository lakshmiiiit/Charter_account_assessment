package com.example.rewards.service;

import java.util.*;
/** Service that calculates reward points. */
public interface RewardService {
	Map<String, Integer> getRewards(Long customerId);
}
