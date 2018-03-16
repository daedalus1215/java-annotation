package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.Coach.CoachInterface;

public class annotationScopeDemoApp2 {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		CoachInterface mSillyCoach = context.getBean("tennisCoach", CoachInterface.class);
		
		CoachInterface mSillyCoachSecond = context.getBean("tennisCoach", CoachInterface.class);
		
		// call a method on the bean
		mSillyCoach.displayDailyWorkout();
		
		mSillyCoach.displayDailyFortune();
		
		mSillyCoachSecond.displayDailyFortune();
		
		mSillyCoachSecond.displayDailyFortune();
		
		boolean result = (mSillyCoach == mSillyCoachSecond);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for mSillyCoach: " + mSillyCoach);
		System.out.println("\nMemory location for mSillyCoachSecond: " + mSillyCoachSecond);

		// close the context
		context.close();
	}

}



