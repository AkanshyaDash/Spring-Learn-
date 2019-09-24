package com.SpringDemo.Student;

import org.springframework.stereotype.Component;


public class ArtsStudent implements Student {
	
	private FortuneService fortuneService;
	
	 public ArtsStudent(FortuneService theFortuneService) {
		 fortuneService=theFortuneService;
	 }
	 
	@Override
	public String getDailyStudy() {
		return "Study history of art";
	}

	@Override
	public String getDailyGames() {
		return fortuneService.getDailyGames();
	}

}
