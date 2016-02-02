package org.campus02.Tiere;

public class Cat extends Animal {

	protected String name;
	
	public Cat(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}
	
	public void walk(){
		System.out.println("catch, catch, catch");
	}
	
	public void makeNoise(){
		System.out.println("miao, miao, miao");
	}

	public Cat(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name = name;
	}
	

}
