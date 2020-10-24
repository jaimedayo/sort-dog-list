
package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	String [] arrayWord;
	
	private String [] list1;
	private String [] list2;
	private String [] arrayStrings;
	private LinkedList<Dog> listDog;
	private PApplet app;
	
	public  Logic(PApplet app) {
		this.app=app;
		
		list1 = app.loadStrings("../data/datosUno.txt");
		list2 = app.loadStrings("../data/datosDos.txt");
		listDog = new LinkedList<Dog>();
		
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if(list1[i].charAt(0)==list2[j].charAt(0)) {
				
					
				}
			}
		}
		
				arrayStrings =list1;
		
		for (int i = 0; i < arrayStrings.length; i++) {
			String lineString = arrayStrings[i];
			 arrayWord = lineString.split(",");
			Dog obj = null;
			
			
			
			
		
				
				int id = Integer.parseInt(arrayWord[0]);
				String name = (arrayWord[1]);
				int age = Integer.parseInt(arrayWord[2]);
				String race = "no found";
				String date = "no found";
				
			
					listDog.add( new Dog (id, name, age, race, date, app));
					
			
		}
	}
	public void sort(int c) {
		switch(c) {
		
		  case 0://ordenamiento natural ID 
		    
		    break;
		  case 1: //ordenar nombre perro
		   
		    break;
		  case 2: //ordenar edad del perro
			   
	break;
		  case 3: // ordenar raza del perro
			   
			    break;
		  case 4: //ordenar fecha nacimiento
			   
			    break;
		}
	}
	
	
	public void addElementList(Dog obj) {
		listDog.add(obj);
	}
public void draw() {
	System.out.println(list1);
}
	public LinkedList<Dog> getList() {
		return listDog;
	}

	
} 
