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
		size(800,600);
		c=0;
	}
	
	public void setup() {
		
		controller = new Controller(this);
		
	}
	
	public void draw() {
		background(0);
		for (int i=0 ;i <controller.listDog().size();i++) {
			controller.listDog().get(i).draw(i*125);
		}
	//controller.draw();
	}
	
	public void mousePressed() {
		c++;
		if(c>=5) {
			c=0;
		}
	controller.sortList(c);	
		}
	
	}

