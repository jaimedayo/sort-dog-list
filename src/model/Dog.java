package model;

import processing.core.PApplet ;

public class Dog implements Comparable<Dog> {
	public int id;
	public String name;
	public int age;
	public String race;
	public String date;
	protected PApplet app;
	
 public Dog(int id,String name,int age,String race,String date,PApplet app ) {
	 this.id =id;
	 this.name=name;
	 this.age= age;
	 this.race= race;
	 this.date=date;
	 this.app= app;
	 
 }
 public String getName() {
	 return this.name;
 }
 public int getAge() {
	 return this.age;
 }
 public int getId() {
	 return this.id;
 }
 public String getRace() {
	 return this.race;
 } 
 public String getDate() {
	 return this.date;
 }


public int compareTo(Dog nextDog) {
	
	return this.id - nextDog.getId();
}
public void draw(int x) {
	app.fill(220);
	app.rect(x,20,90,150);
	app.fill(0);
	app.text(this.id,x+20,40);
	app.text(this.name,x+20,60);
	app.text(this.age,x+20,80);
	app.text(this.race,x+20,100);
	app.text(this.date,x+20,120);
	
}
}
