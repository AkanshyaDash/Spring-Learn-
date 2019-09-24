package com.SpringDemo.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	
		Student artist = context.getBean(ArtsStudent.class,Student.class);   // ! default name "artsStudent" not working..
	
		System.out.println("For Arts Students : "+artist.getDailyStudy());
		System.out.println(artist.getDailyGames());

		context.close();
		
	}

}
