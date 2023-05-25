package Inheritance_Overriding;

//This is a child class, it extends the parent class which is the Vehicle Class
//This child class inherits the properties listed in the parent class
//It also overrides the stop method from the parent class to provide it's own implementation of a method

public class Toyota_VIOS extends Vehicle {
	
	String tireType = "Radial tires";
	
	public void drive() {
		System.out.println("The Car is currently available for test drive");
		
	}
	
	//Here we Override the stop() method from the parent class Vehicle class
	
	@Override
	void stop() {
		super.stop();
	}

}
