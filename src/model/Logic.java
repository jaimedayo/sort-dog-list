
package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	String [] arrayWord;
	
	private String [] arrayStrings;
	private ArrayList<Dog> listDog;
	private PApplet app;
	
	public  Logic(PApplet app) {
		
		arrayStrings = app.loadStrings("../data/datosUno.txt");
		listDog = new ArrayList<Dog>();
		
		for (int i = 0; i < arrayStrings.length; i++) {
			String lineString = arrayStrings[i];
			 arrayWord = lineString.split(",");
			Dog obj = null;
			
			
			
			
			for (int j = 0; j < arrayWord.length; j++) {
				
				int id = Integer.parseInt(arrayWord[0]);
				String name = (arrayWord[1]);
				int age = Integer.parseInt(arrayWord[2]);
				String race = (arrayWord[3]);
				String date = (arrayWord[4]);
				
			
						 new Dog (id, name, age, race, date, app);
			}
			addElementList(obj);
		}
	}
	
	
	public void addElementList(Dog obj) {
		listDog.add(obj);
	}
public void draw() {
	System.out.println(arrayWord);
}
	public ArrayList<Dog> getListFigure() {
		return listDog;
	}

	
} 
