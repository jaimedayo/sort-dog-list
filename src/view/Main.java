package view;

import controller.Controller;

import processing.core.PApplet;

public class Main extends PApplet{

	
 Controller controller;
	int c;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(860,500);
		c=1;
	}
	
	public void setup() {
		
		controller = new Controller(this);
		
	}
	
	public void draw() {
		background(0);
		for (int i=0 ;i <controller.listDog().size();i++) {
			controller.listDog().get(i).draw((i*85)+5);
		}
	//controller.draw();
	}
	
	public void mousePressed() {
		c=0;
		controller.sortList(c);
	controller.sortList(c);	
		}
	
	}

