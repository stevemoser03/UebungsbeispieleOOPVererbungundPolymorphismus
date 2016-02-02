package org.campus02.Tiere;

public class Frog extends Animal {

	public Frog(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}
	
	
	public void walk(){
		System.out.println("jump, jump, jump");
	}
	
	public void makeNoise(){
		System.out.println("quak, quak, quak");
	}

}
