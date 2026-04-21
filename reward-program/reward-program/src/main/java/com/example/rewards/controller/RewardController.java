package com.example.rewards.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.rewards.service.*;
/** REST controller for rewards endpoints. */
@RestController
@RequestMapping("/api")
public class RewardController {
	private final RewardService service;

	public RewardController(RewardService s) {
		this.service = s;
	}

	@GetMapping("/rewards/{id}")
	public Map<String, Integer> rewards(@PathVariable Long id) {
		return service.getRewards(id);
	}
}
