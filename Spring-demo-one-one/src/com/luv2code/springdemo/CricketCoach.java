package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {

		System.out.println("Cricketcoach no arg constructor");

	}

	// our setter method for spring
	public void setFortuneService(FortuneService fortuneService) {

		System.out.println("cricketcoach inside setter method ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {
		return "paractice bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
