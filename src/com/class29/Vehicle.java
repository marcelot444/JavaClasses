package com.class29;

public abstract class Vehicle {
	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehhicle can stop");
	}

	public abstract void start();

	public abstract  void speed();

}

abstract class Car extends Vehicle {
	public void speed() {
		System.out.println("Max car speed up to 400");
	}
	public abstract void breaking();
}

class BMW extends Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		
	}
	
	
}
