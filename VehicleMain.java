// Create by : Peter zhu
// Create on : Oct 2018
// This is main class of Vehicle class

public class VehicleMain {
	
	public static void main(String[]args) {
		
		Bike bikeObject = new Bike(000, 0, 12, 20, "red",5);
		bikeObject.speak();
		bikeObject.accelerate(20);
		bikeObject.brake(10);
		bikeObject.tires();
		System.out.println();
		
		Truck truckObject = new Truck(3636363, 2, 50, 100, "blue",500);
		truckObject.speak();
		truckObject.tires();
		truckObject.accelerate(20);
		truckObject.brake(10);
		System.out.println();
		
	}

}
