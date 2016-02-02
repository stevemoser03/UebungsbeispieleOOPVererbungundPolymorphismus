package org.campus02.Tiere;

public class Dog extends Animal {

	protected String name;
	
	public Dog(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}

	public void walk(){
		System.out.println("run, run, run");
	}
	
	public void makeNoise(){
		System.out.println("wuff, wuff, wuff");
	}

	public Dog(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name = name;
	}
	
}
