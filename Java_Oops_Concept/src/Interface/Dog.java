package Interface;

public class Dog extends Cat implements Animals{

	Dog d = new Dog();
	Animals a = d;
	Cat c = d;
	
	

	public void bark() {
		System.out.println("Dog is barking");
	}
	
	
}
