// Create by : Peter zhu
// Create on : Oct
// This is Bike class

public class Bike extends Vehicle{
	
	int _gearNumber;

	public Bike(int licensePlateNumber, int numberOfDoor, int speed, int max, String color, int gear) {
		super(000, 0, 12, 20, "red");
		_gearNumber = gear;
		System.out.println();
		
	}
	
	public void speak() {
		System.out.println("This is Bike");
		super.speak();
		System.out.println("The numbers of the gear is " + _gearNumber);
		System.out.println();
	}
	
	public int tires() {
		int tires = 2;
		System.out.println("The bike tires is " + tires);
		return tires;
	}
	
	public void Brake() {
		super.brake(30);
	}
	
	public void accelerate() {
		super.accelerate(10);
	}
	
}
