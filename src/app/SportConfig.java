package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import spring.annotation.Coach.CoachInterface;
import spring.annotation.Coach.SwimCoach;
import spring.annotation.Fortune.DbFortuneService;
import spring.annotation.Fortune.FortuneService;
import spring.annotation.Fortune.FortuneServiceInterface;


@ComponentScan("spring.annotation")
public class SportConfig {
	
	@Bean
	public FortuneServiceInterface dbFortuneService() {
		return new DbFortuneService();
	}
	
	
	@Bean
	public CoachInterface swimCoach(FortuneService fortuneService) {
		SwimCoach mySwimCoach = new SwimCoach(fortuneService);
		
		return mySwimCoach;
	}
}
