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
		
		for (int i=0 ;i <controller.listDog().size();i++) {
			controller.listDog().get(i).draw((i*85)+5);
		}
		rectMode(CENTER);
		fill (220);
		rect(300,300,430,100);
		fill(0);
		textSize(20);
		text("click to sort the list a new way",150,300);
		textSize(10);
		
		rectMode(CORNER);
		fill(220);
		rect(580,200,90,150);
		fill(0);
		text("Id",600,40+200);
		text("Name",600,60+200);
		text("Age",600,80+200);
		text("race",600,100+200);
		text("date",600,120+200);
	//controller.draw();
	}
	
	public void mousePressed() {
		c++;
		if(c>=5) {c=0;}
		controller.sortList(c);
	controller.sortList(c);	
		}
	
	}

