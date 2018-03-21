package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.annotation.Coach.DanceCoach;
import spring.annotation.Fortune.DbFortuneService;
import spring.annotation.Fortune.FortuneServiceInterface;

@Configuration
@PropertySource("classpath:instructor.properties")
public class DanceConfig {

	@Bean
	public FortuneServiceInterface dbFortuneService() {
		return new DbFortuneService();
	}
	
	
	@Bean
	public DanceCoach danceCoach(FortuneServiceInterface fortuneService) {
		DanceCoach mySwimCoach = new DanceCoach(dbFortuneService());
		return mySwimCoach;
	}
}
