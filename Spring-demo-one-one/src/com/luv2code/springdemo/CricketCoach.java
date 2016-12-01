package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("cricketcoach inside setter method - set emailaddress ");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketcoach inside setter method - set team name ");

		this.team = team;
	}

	// add fields for email and team
	private String emailAddress, team;

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
