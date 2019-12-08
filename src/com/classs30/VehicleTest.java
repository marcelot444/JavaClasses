package com.classs30;
public class VehicleTest {
	public static void main(String[] args) {
		BMW bmw=new BMW("54gege","Sedan","BMW","X5");
		BMW.displayTotal();
		//come from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		//comes from car class
		bmw.breaking();
		bmw.drive();
		//come from bmw class
		bmw.display();
		
		Car car=new BMW("57gyo89","Suv","BMW","series 4");
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		//comes from car class
		bmw.breaking();
		bmw.drive();
		//come from bmw class
		//bmw.display();--> comes from bmw class and can't be used 

	}

}
