package org.campus02.Tiere;

public class Lion extends Animal {

	public Lion(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}

	public void walk(){
		System.out.println("go, go, go");
	}
	
	public void makeNoise(){
		System.out.println("miao?, miao?, miao?");
	}
	public void roar(){
		System.out.println("roar, roar, roar");
	}
	
}
