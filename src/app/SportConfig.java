package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import spring.annotation.Coach.CoachInterface;
import spring.annotation.Coach.SwimCoach;
import spring.annotation.Fortune.DbFortuneService;
import spring.annotation.Fortune.FortuneService;
import spring.annotation.Fortune.FortuneServiceInterface;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneServiceInterface dbFortuneService() {
		return new DbFortuneService();
	}
	
	
	@Bean
	public SwimCoach swimCoach(FortuneServiceInterface fortuneService) {
		SwimCoach mySwimCoach = new SwimCoach(dbFortuneService());
		
		return mySwimCoach;
	}
}
