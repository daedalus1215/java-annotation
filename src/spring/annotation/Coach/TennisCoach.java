package spring.annotation.Coach;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.annotation.Fortune.FortuneServiceInterface;


@Component
public class TennisCoach implements CoachInterface {
	
	private FortuneServiceInterface fortuneService;
	
	@Autowired
	public TennisCoach(FortuneServiceInterface theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public void displayDailyWorkout() {
		System.out.println("Tennis coach's Daily workout!");
	}
	
	
	@Override
	public void displayDailyFortune() {
		System.out.println(this.fortuneService.getFortune());
	}
}
