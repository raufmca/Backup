package Inheritance;

public class Animal {

	private static String breed;
	private static String color;
	
	public static int teeths;
	
	public int legs;
	
	protected String pecies;
	
	public Animal() {
		System.out.println("Animal Default constructor");
	}
	
	public Animal(String breed, String color, int teeths, int legs, String pecies) {
		this.breed = breed;
		this.color = color;
		this.teeths = teeths;
		this.legs = legs;
		this.pecies=pecies;
	}
	
	public void barking() {
		System.out.println("Animal Barking");
	}
	
}
