package com.SpringDemo.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PlayGameService implements GameService {

	@Override
	public String getDailyGames() {

		ArrayList <String> games = new ArrayList <String> ();
		
		try (FileReader f = new FileReader("Games.txt")) {
			
			StringBuffer bf = new StringBuffer();
			
			while (f.ready()) {
				
				char c = (char) f.read();
				
				if (c == '\n') {
					games.add(bf.toString());
					bf = new StringBuffer();
				}
				else {
					bf.append(c);
				}
				
			}
			
			if(bf.length()>0) {
				games.add(bf.toString());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		Random newIndex = new Random();
		
		for(int i =1;i<=1;i++) {
			
			int myIndex = newIndex.nextInt(5);
			System.out.println("generated index: "+myIndex);
			System.out.println("once ure done, u can go play  " + games.get(myIndex));		
	}
		
		return "GG";
	}

}
