package Inheritance;

public class BMW extends Car{
	
	public void refuel(String time, int qty) {
		System.out.println(" Refule from BMW -----" + time);
		fuel = fuel + qty;
	}

	public BMW() {
		System.out.println(" INside BMW cunstructor ");
	}
	
	public BMW(String name, int fuel) {
		this.fuel = fuel;
		this.name = name;
	}
	
	public int refuel() {
		
		System.out.println("Inside fuel function in BMW");
		return fuel;
	}
	
	public void gps() {
		System.out.println(" Inside BMW GPS function");
	}
}
