package com.SpringDemo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommerceStudent implements Student {
	
	@Autowired
	@Qualifier("playGameService")
	private GameService gameService;
	
	//setter injection
	
	 public CommerceStudent() {
	}
	
	
	public void setGameService(GameService theGameService) {
		gameService = theGameService;
	}

	@Override
	public String getDailyStudy() {
		
		return "Study Accountancy and finance markets";
	}

	@Override
	public String getDailyGames() {
		return gameService.getDailyGames();
	}

}
