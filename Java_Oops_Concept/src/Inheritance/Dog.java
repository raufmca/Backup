package Inheritance;

public class Dog extends Animal{
	
	private String bark;
	
	boolean tail;
	
	
	public Dog() {
		
		System.out.println("Inside Dog deafult");
	}
	
	public Dog(String bark, boolean tail) {
		this.bark = bark;
		this.tail = tail;
		
	}
	
	public void barking() {
		System.out.println(" Dog Barking ");
	}
	

}
