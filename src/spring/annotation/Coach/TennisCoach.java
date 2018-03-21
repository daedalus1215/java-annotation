package spring.annotation.Coach;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import spring.annotation.Fortune.FortuneServiceInterface;



@Component
public class TennisCoach implements CoachInterface {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServiceInterface fortuneService;
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayDailyWorkout() {
		System.out.println("Tennis coach's Daily workout!");
	}
	
	
	@Override
	public void displayDailyFortune() {
		System.out.println(this.fortuneService.getFortune());
	}
	
	
	public final void init() {
		System.out.println(">> Tennis Coach inside of init()!");
	}
	
	
	
}
