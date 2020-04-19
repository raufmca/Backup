package Inheritance;

public class Car {
	
	protected String name;
	int fuel;
	
	public Car() {
		System.out.println("Inside Default Constructor");
	}
	
	public Car(String name, int fuel) {
		this.name = name;
		this.fuel = fuel;
		
		System.out.println(" Inside your overloaded cunstructor");
		
	}

	public void start() {
		System.out.println(" Car " + name + " started with fuel capacity " + fuel);
	}
	
	public int refuel() {
		
		System.out.println("Inside fuel function Parent Car");
		return fuel;
	}
	
	public int refuel(int qty) {
		System.out.println(" INside overloaded refuel function  " + qty);
		return fuel+qty;
	}
}
