package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {

		return "Run a hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it \n" + fortuneService.getFortune();
	}

	// add an init method

	public void doMyStartupStuff() {

		System.out.println("Trackcoach : domystartupstuff");
	}

	// add a destroy method

	public void doMyCleanUpStuff() {

		System.out.println("Trackcoach : doMyCleanUpStuff");
	}

}
