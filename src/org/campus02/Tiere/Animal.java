package org.campus02.Tiere;

public class Animal {

	protected String color;
	protected int countEyes;
	public Animal(String color, int countEyes) {
		super();
		this.color = color;
		this.countEyes = countEyes;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCountEyes() {
		return countEyes;
	}
	public void setCountEyes(int countEyes) {
		this.countEyes = countEyes;
	}
	
	public void walk(){
		System.out.println("move");
	}
	
	public void makeNoise(){
		System.out.println("noise");
	}
	
}
