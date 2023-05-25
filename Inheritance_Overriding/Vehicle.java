package Inheritance_Overriding;

//This is the parent class where all the properties of each class are listed

public class Vehicle {

	int toyotaSpeed = 100;
	String toyotaColor = "Purplish Silver Mica Metallic";
	String toyotaPrice = "PhP 1,265,000";
	
	int planeSpeed = 1000;
	String planeColor = "White with Green Strips";
	String planePrice = "PhP 110,000,000";
	
	int yachtSpeed = 37;
	String yachtColor = "White";
	String yachtPrice = "PhP 12,500,000";
	
	void stop() {
		System.out.println("Vehicle has finally Stop");
	}

}


