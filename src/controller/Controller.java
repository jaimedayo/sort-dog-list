package controller;
import java.util.ArrayList;
import java.util.LinkedList;

import model.Dog;
import model.Logic;
import processing.core.PApplet;


public class Controller {
	
	private Logic logic;
private PApplet app;
	
	public Controller(PApplet app) {
		this.app = app;
	logic = new Logic(app);
		
	}
	
	public void draw() {
		logic.draw();
	}
	
	public void sortList(int c) {
		logic.sort(c);
	}
	public LinkedList<Dog> listDog(){
		return logic.getList();
	}

}
