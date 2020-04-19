package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		// Car c = new Car();
		/*
		 * Car c1 = new Car("Honda", 500);
		 * 
		 * c1.start();
		 * 
		 * System.out.println(" --------" + c1.refuel());
		 * 
		 * System.out.println("**** " + c1.refuel(100));
		 */
	
	/*
		BMW b = new BMW();
		
		b.refuel();
		b.fuel = 1000;
		b.gps();
		b.refuel(200);
		
		*/
		
		Car c = new BMW("TTT", 560);
		
		c.refuel();
		c.refuel(200);
		c.start();
		
		//BMW b = new Car();
	}
	
	

}
