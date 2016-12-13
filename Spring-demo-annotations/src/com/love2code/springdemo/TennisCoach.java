package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public TennisCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getfortune();
	}

}
