package com.class27;

public class Car {
	String make,model;
	int year;
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	public void display() {
		System.out.println("We build "+year+" "+make+" "+model);
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.display();
		
		//int num;--> CE: local variables must be inizialized
		//System.out.println();
		System.out.println("----------Object of child class------");
		Tesla tesla=new Tesla();
	}

}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		System.out.println("No argument constructor of the child class");
	}
}