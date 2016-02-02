package org.campus02.Tiere;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		Frog quaxi = new Frog("green", 2);
		Animal quaxiAsAnimal = quaxi;
		Frog quaxi1 = (Frog) quaxiAsAnimal;
		quaxiAsAnimal.makeNoise();
		quaxi1.makeNoise();
		
		
		Cat mitzi = new Cat("brown",2,"Mitzi");
		Animal a = mitzi;
		a.makeNoise();
		Cat kitty = (Cat) a;
		kitty.makeNoise();
		
		Dog doggy = new Dog("brown", 2, "Spike");
		
		Nature list = new Nature();
		
		list.addAnimal(quaxi1);
		list.addAnimal(mitzi);
		list.addAnimal(kitty);
		list.addAnimal(doggy);
		
		int countcolor = list.countColor("green");
		System.out.println(countcolor);
	}

}
