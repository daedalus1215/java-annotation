package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.Coach.CoachInterface;

public class annotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		CoachInterface mSillyCoach = context.getBean("thatSillyCoach", CoachInterface.class);
		
		// call a method on the bean
		mSillyCoach.getDailyWorkout();
		// close the context
		context.close();
	}

}



