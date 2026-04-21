package com.example.rewards.service;

import org.springframework.stereotype.Service;
import java.util.*;
import java.time.*;
import com.example.rewards.repository.*;
/** Implementation of reward calculation logic. */
@Service
public class RewardServiceImpl implements RewardService {
	private final TransactionRepository repo;

	public RewardServiceImpl(TransactionRepository r) {
		this.repo = r;
	}

	int points(double a) {
		if (a < 50)
			return 0;
		if (a <= 100)
			return (int) (a - 50);
		return 50 + (int) ((a - 100) * 2);
	}

	public Map<String, Integer> getRewards(Long id) {
		Map<String, Integer> map = new HashMap<>();
		for (var t : repo.findByCustomer_Id(id)) {
			String m = YearMonth.from(t.getTransactionDate()).toString();
			map.put(m, map.getOrDefault(m, 0) + points(t.getAmount()));
		}
		return map;
	}
}
