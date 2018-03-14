package spring.annotation.Coach;


import org.springframework.stereotype.Component;


@Component("thatSillyCoach")
public class TennisCoach implements CoachInterface{
	public TennisCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("Tennis coach's Daily workout!");
	}	
}
