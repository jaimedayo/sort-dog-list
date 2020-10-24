package controller;

import java.util.ArrayList;

import model.Logic;

import processing.core.PApplet;

public class Controller {
	
	private Logic logic;
	private PApplet processing;
	
	public Controller(PApplet processing) {
		logic = new Logic(processing);
	}
	
	

}
