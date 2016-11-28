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

}
