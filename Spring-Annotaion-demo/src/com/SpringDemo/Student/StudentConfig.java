package com.SpringDemo.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* this class uses no xml spring configuration */

@Configuration
//@ComponentScan("com.SpringDemo.Student")
public class StudentConfig {
	
	@Bean
	public FortuneService fortuneService() {         //define dependency
		return new FortuneService();
	}
	
	@Bean
	public Student artStudent () {                  //define class and inject above dependency
		 ArtsStudent myArtStudent = new ArtsStudent(fortuneService());
		return myArtStudent; 
	}
	
	 
}
