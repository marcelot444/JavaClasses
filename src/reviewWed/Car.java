package reviewWed;

public class Car {
	String make;
	String color;
	String model;

	
	
	public Car() {//no parameter returns object
		
	}
	
	public Car(String type) {
		make=type;
	}
	public Car(String type, String carColor) {
		make=type;
		color=carColor;
	}
	public void displayInfo() {
		System.out.println("This a car. Type is: "+make+" color is: "+color);
	}
}
