package spring.annotation.Coach;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import spring.annotation.Fortune.FortuneServiceInterface;


@Component
@Scope("prototype")
public class TennisCoach implements CoachInterface {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServiceInterface fortuneService;
		
	@Override
	public void displayDailyWorkout() {
		System.out.println("Tennis coach's Daily workout!");
	}
	
	
	@Override
	public void displayDailyFortune() {
		System.out.println(this.fortuneService.getFortune());
	}
}
