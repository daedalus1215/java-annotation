package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.Coach.CoachInterface;
import spring.annotation.Coach.SwimCoach;



public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach mSillyCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		mSillyCoach.displayDailyWorkout();
		
		mSillyCoach.displayDailyFortune();
				
		
		System.out.println("Email address is: " + mSillyCoach.getEmail());
		System.out.println("Team is: " + mSillyCoach.getTeam());
		System.out.println("\nMemory location for mSillyCoach: " + mSillyCoach);

		// close the context
		context.close();
	}

}



