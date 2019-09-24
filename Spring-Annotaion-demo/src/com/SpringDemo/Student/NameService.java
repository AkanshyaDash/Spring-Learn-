package com.SpringDemo.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NameService implements GameService {

	@Override
	public String getDailyGames() {
		// TODO Auto-generated method stub

		ArrayList <String> names = new ArrayList <String> ();
		
		try(FileReader f = new FileReader("Names.txt")) {
			
			StringBuffer bf = new StringBuffer();
			
			while(f.ready()) {
				char c = (char) f.read();    /*will read file char by char*/
				
				//System.out.println("char first caught before if: "+c);
				
				if(c == '\r') {         
					names.add(bf.toString());     /*if space is encountered the space will be avoided (that memory space shall be made null, and new memory is allocated.)*/
					bf = new StringBuffer();
					
					//System.out.println("character encountered in if: "+c);
					//System.out.println("added: "+bf.toString());	
				}
				else {
					bf.append(c);
					//System.out.println("went to else ...bf = "+c);
				}
			}
			
			if(bf.length()>0) {
				names.add(bf.toString());
				
				//System.out.println("added outside while: "+bf.toString());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Random index = new Random();      //generate random name
		
		for(int i =1;i<=1;i++) {
			
			int myIndex = index.nextInt(51);
			System.out.println("generated index: "+myIndex);
			System.out.println("Name drawn  :  ---------------------------------" + names.get(myIndex));		
			}
		
		return " ";
	}


}







