package spring.annotation.Coach;

import org.springframework.beans.factory.annotation.Value;

import spring.annotation.Fortune.FortuneServiceInterface;



public class DanceCoach implements CoachInterface {

	private FortuneServiceInterface fortuneService;
	
	@Value("${instructor.name}")
	private String instructorName;
	
	@Value("${instructor.email}")
	private String instructorEmail;
	
	
	public DanceCoach(FortuneServiceInterface fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public void displayDailyWorkout() {
		System.out.println("Dance coaching can demand so many hours of dance.");

	}

	@Override
	public void displayDailyFortune() {
		System.out.println(this.fortuneService.getFortune());

	}


	public FortuneServiceInterface getFortuneService() {
		return fortuneService;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public String getInstructorEmail() {
		return instructorEmail;
	}
}
