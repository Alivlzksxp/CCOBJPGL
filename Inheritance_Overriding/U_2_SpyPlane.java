package Inheritance_Overriding;

//This is a child class, it extends the parent class which is the Vehicle Class
//This child class inherits the properties listed in the parent class
//It also overrides the stop method from the parent class to provide it's own implementation of a method

public class U_2_SpyPlane extends Vehicle {
	
	int wingSpan = 117;
	
	public void fly() {
		System.out.println("The Plane has taken off");
		
	}
	
	//Here we Override the stop() method from the parent class Vehicle class
	
	@Override
	void stop() {
		super.stop();
	}

}
