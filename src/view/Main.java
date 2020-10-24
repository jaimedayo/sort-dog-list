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
		c=10;
	}
	
	public void setup() {
		
		controller = new Controller(this);
		
	}
	
	public void draw() {
		background(0);
		rectMode(CORNER);
		for (int i=0 ;i <controller.listDog().size();i++) {
			controller.listDog().get(i).draw((i*85)+5);
		}
		rectMode(CENTER);
		fill (220);
		rect(300,300,430,100);
		fill(0);
		textSize(20);
		text("click to sort the list of a new way",150,300);
		textSize(10);
	//controller.draw();
	}
	
	public void mousePressed() {
		c++;
		if(c>=5) {c=0;}
		controller.sortList(c);
	controller.sortList(c);	
		}
	
	}

