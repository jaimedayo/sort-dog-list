package model;

import java.util.Comparator;

public class DogAgeCompare implements Comparator<Dog>  {

	public int compare(Dog o1, Dog o2) {
		return o1.getAge()-o2.getAge();
	}

}
