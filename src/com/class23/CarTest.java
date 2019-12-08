package com.class23;

public class CarTest {
	
	public static void main(String[] args) {
		
		
		Car.make="Toyota";
		Car car1=new Car();
		car1.model="Camry";
		car1.color="Pink";
		car1.getDetails();
		
		Car car2=new Car();// constructor special methods/ block of code that is being executed
		car1.model="Corolla";// when we create an object/ an instnace of the class
		car1.color="Blue";
		car1.getDetails();
		System.out.println();
		
		Car car3=new Car();
		car2.model="Prius";
		car2.color="Green";
		car2.getDetails();
		System.out.println("**********************");
		
		BetterCar betterCar1=new BetterCar("Toyota","White",180,5);
		betterCar1.getDetails();
	}

}
