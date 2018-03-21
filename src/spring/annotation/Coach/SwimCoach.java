package spring.annotation.Coach;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import spring.annotation.Fortune.FortuneServiceInterface;



@Component
public class SwimCoach implements CoachInterface {
	
	private FortuneServiceInterface fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach(FortuneServiceInterface fortuneService) {
		this.fortuneService = fortuneService;
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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}	
}
