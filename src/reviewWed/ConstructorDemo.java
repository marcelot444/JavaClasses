package reviewWed;

public class ConstructorDemo {
	public static void main(String[] args) {
		Car car1=new Car();
		
		car1.displayInfo();
		car1.make="Honda";
		car1.color="Red";
		
		car1.displayInfo();
		System.out.println();
		
		Car car2=new Car("Toyota");// This is a constructor
		car2.displayInfo();
		//car2.make=""; dont need it
		car2.color="grey";
		car2.displayInfo();
		System.out.println();
		
		Car car3=new Car("Jeep","Blue");// we set the variables here car make and color
		car3.displayInfo();

	}
}
