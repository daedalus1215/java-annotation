package spring.annotation.Coach;


import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements CoachInterface{
	public TennisCoach() {
		System.out.println("no-arg-constructor");
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("Tennis coach's Daily workout!");
	}	
}
