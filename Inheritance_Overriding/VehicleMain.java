package Inheritance_Overriding;

//This is the main class where it is able to access all the classes and methods and print them

public class VehicleMain {
	
		public static void main(String[] args) {
			
		Toyota_VIOS car = new Toyota_VIOS();
		
		System.out.println("Toyota-VIOS:");
		System.out.println("Speed: " + car.toyotaSpeed + " KM/H");
		System.out.println("Color: " + car.toyotaColor);
		System.out.println("Price: " + car.toyotaPrice);
		System.out.println("Tire Type: " + car.tireType);
		
		//These is used to print out the info from the Toyota_Vios class
		car.drive();
		car.stop();
		
		
		U_2_SpyPlane plane = new U_2_SpyPlane();
		
		System.out.println("\n*********************************************\n");
		System.out.println("U2 Spy Plane:");
		System.out.println("Speed: " + plane.planeSpeed + " KM/H");
		System.out.println("Color: " + plane.planeColor);
		System.out.println("Price: " + plane.planePrice);
		System.out.println("Wing Span: " + plane.wingSpan + " Feet");
		
		//These is used to print out the info from the U_2_SpyPlane class
		plane.fly();
		plane.stop();
		
		
		FandangoYacht yacht = new FandangoYacht();
		
		System.out.println("\n*********************************************\n");
		System.out.println("Fandango Yacht:");
		System.out.println("Speed: " + yacht.yachtSpeed + " KM/H");
		System.out.println("Color: " + yacht.yachtColor);
		System.out.println("Price: " + yacht.yachtPrice);
		System.out.println("Main Sail Color: " + yacht.mainSailColor);
		
		//These is used to print out the info from the FandangoYacht class
		yacht.Float();
		yacht.stop();
	}
}
