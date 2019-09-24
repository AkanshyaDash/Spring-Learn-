package com.SpringDemo.Student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student theStudent = context.getBean("scienceStudent",Student.class);
		Student anotherStudent = context.getBean("commerceStudent",Student.class);
		Student wizard = context.getBean("hogwartsStudent",Student.class);
		HogwartsStudent hw = context.getBean("hogwartsStudent",HogwartsStudent.class);
		
		
		System.out.println("For Science people "+theStudent.getDailyStudy());
		System.out.println(theStudent.getDailyGames());
		
		System.out.println("For Commerce people "+anotherStudent.getDailyStudy());
		System.out.println(anotherStudent.getDailyGames());
		
		System.out.println("For wizards and witches "+wizard.getDailyStudy());
		System.out.println(wizard.getDailyGames());    //gets names or games as configured in @qualifier 
		
		
		System.out.println(hw.getProperty1() +"  "+ hw.getProperty2());
		
		context.close();
		
	}

}
