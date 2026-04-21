package com.example.rewards.service;

import java.util.*;

public interface RewardService {
	Map<String, Integer> getRewards(Long customerId);
}