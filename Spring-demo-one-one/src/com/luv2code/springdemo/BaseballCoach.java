package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// define a private field

	private FortuneService fortuneService;

	// define a constructor for dependency injection

	public BaseballCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyworkout() {

		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service
		return fortuneService.getFortune();
	}
}
