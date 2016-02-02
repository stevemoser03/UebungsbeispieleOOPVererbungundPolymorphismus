package org.campus02.Tiere;

import java.util.ArrayList;

public class Nature{

	protected ArrayList<Animal> list = new ArrayList<>();

	public Nature() {
		this.list = list;
	}
	
	public void addAnimal(Animal a){
		list.add(a);
	}
	
	public int countColor(String color){
		int result = 0;
		for (Animal a : list) {
			if(a.getColor().equals(color))
				result += 1;
		}
		return result;
	}
	
	
}
