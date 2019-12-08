package com.class17;

public class ObjectsOfCarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car1=new Car();
	        car1.make="Tesla";
	        car1.model="S3";
	        car1.color="Black";
	        car1.year=2020;
	        car1.wheels=4;
	        car1.windows=5;
	        car1.speed=200;
	        car1.drive();
	        car1.accelerate();
	        car1.drive();
	        
	        System.out.println("--------------------------");
	        
	        Car car2=new Car();
	        car2.make="BMW";
	        car2.model="i8";
	        car2.color="Purple";
	        car2.year=2019;
	        car2.wheels=4;
	        car2.windows=6;
	        car2.speed=300;
	        
	        car2.drive();
	        car2.accelerate();
	        car2.drive();
	        
	        
	        
	        System.out.println("I have "+car1.color+" ");
	        
	        
	        
	        
	        
	        
	        

	}

}
