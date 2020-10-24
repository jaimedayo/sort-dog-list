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
}
