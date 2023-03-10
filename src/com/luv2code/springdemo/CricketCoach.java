package com.luv2code.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// Create noiArg Const
	public CricketCoach() {
		//System.out.println("inside no arg const");
	}
	
	//generate setters
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method :== setFortuneService");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15v min";
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setEmailAddress method :== setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setTeam method :== setTeam");
		this.team = team;
	}
	}
