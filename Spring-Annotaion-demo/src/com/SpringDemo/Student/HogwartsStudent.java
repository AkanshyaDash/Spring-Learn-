package com.SpringDemo.Student;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HogwartsStudent implements Student {
	
	
	public HogwartsStudent() {

		System.out.println("inside default constructor : [HogwartsStudent]");
	}	

	@Autowired                            //field injection (done bts using java reflection tech)
	@Qualifier("nameService")
	private GameService gameService;
	
	@Value("${MyReq.property1}")
	private String property1;
	
	@Value("${MyReq.property2}")
	private String property2;
	
	@Override
	public String getDailyStudy() {
		// TODO Auto-generated method stub
		return "Practice Expilliarmus and Work on the patronus charm";
	}

	public String getProperty1() {
		return property1;
	}

	public String getProperty2() {
		return property2;
	}

	@Override
	@PostConstruct    //gets called after default constructor 
	public String getDailyGames() {
		// TODO Auto-generated method stub
		return gameService.getDailyGames();
	}

}
