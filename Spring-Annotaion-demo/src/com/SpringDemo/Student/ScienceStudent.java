package com.SpringDemo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component                                   //taking default bean id : scienceStudent
public class ScienceStudent implements Student {

	
	private GameService gameService;
	
	@Autowired
	
	 public ScienceStudent(@Qualifier("playGameService") GameService theGameService) {
		gameService = theGameService;
	}
	
	
	
	@Override
	public String getDailyStudy() {

		return "study physics motion and organic chemistry equations";
	}

	@Override
	public String getDailyGames() {
		return gameService.getDailyGames();
	}

}
