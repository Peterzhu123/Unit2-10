// Create by : Peter zhu
// Create on : Oct 2018
// This is Vehicle class

public abstract class Vehicle {
	
	private int _platenumber;
	private String _vehicleColor;
	private int _door;
	private int _speed = 0;
	private int _maxSpeed;
	private int _minSpeed;
	
	public Vehicle(int licensePlateNumber ,int numberOfDoor, int speed, int max, String color ) {
		_platenumber = licensePlateNumber;
		_door = numberOfDoor;
		_speed = speed;
		_maxSpeed = max;
		_vehicleColor = color;
	}
	
	public void speak() {
		System.out.println("The plate number of the vehicle is " + _platenumber);
		System.out.println("The color of the vehicle is " + _vehicleColor);
		System.out.println("The number of door of the vehicle is " + _door);
		System.out.println("The speed of the vehicle is " + _speed);
		System.out.println();
	}
	
	public int tires() {
		int tires = 4;
		System.out.println("The vehicle tires is " + tires);
		return tires;
	}
	
	protected void accelerate(int increasement) {
		if (_speed > _maxSpeed) {
			_speed = _maxSpeed;
			System.out.println("You already reach the max speed");
		}
		else {
			_speed = increasement + _speed;
		}
		System.out.println("The speed will be after accelerate " + _speed);
	}
	
	protected void brake(int decreasement) {
		if(_speed < _minSpeed) {
			_speed = _minSpeed;
			System.out.println("The vehicle has stop");
		}else {
			_speed = _speed - decreasement;
		}
		System.out.println("The speed will be after brake " + _speed);
		
	}
	
}
