
package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	
	private String [] arrayStrings;
	private ArrayList<Dog> listDog;
	private PApplet processing;
	
	public  Logic(PApplet processing) {
		arrayStrings = processing.loadStrings("../data/textOne.txt");
		listDog = new ArrayList<Dog>();
		
		for (int i = 0; i < arrayStrings.length; i++) {
			String lineString = arrayStrings[i];
			String [] arrayWord = lineString.split(",");
			Dog obj = null;
			
			for (int j = 0; j < arrayWord.length; j++) {
				
				
				
				int id = Integer.parseInt(arrayWord[0]);
				String name = (arrayWord[1]);
				int age = Integer.parseInt(arrayWord[2]);
				String race = (arrayWord[3]);
				String date = (arrayWord[4]);
				
			
						 new Dog (id, name, age, race, date, processing);
			}
			addElementList(obj);
		}
	}
	
	public void addElementList(Dog obj) {
		listDog.add(obj);
	}

	public ArrayList<Dog> getListFigure() {
		return listDog;
	}

	
} 
