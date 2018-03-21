package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.annotation.Coach.CoachInterface;
import spring.annotation.Coach.DanceCoach;
import spring.annotation.Coach.SwimCoach;



public class DancejavaConfigDemo {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DanceConfig.class);
		
		// get the bean from spring container
		DanceCoach mSillyCoach = context.getBean("danceCoach", DanceCoach.class);
		
		// call a method on the bean
		mSillyCoach.displayDailyWorkout();
		
		mSillyCoach.displayDailyFortune();
				
		
		System.out.println("Email address is: " + mSillyCoach.getInstructorEmail());
		System.out.println("name is: " + mSillyCoach.getInstructorName());
		System.out.println("\nMemory location for mSillyCoach: " + mSillyCoach);

		// close the context
		context.close();
	}
}



