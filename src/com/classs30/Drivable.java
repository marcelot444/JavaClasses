package com.classs30;

public interface Drivable { //interface is a collection of public static final and abstracts
	//similar to classes inside interface you can ONLY have public static final methods and abstracts
	//public static final variables are automatically added constant variables 
	//written in upper case
	
	boolean DRIVE_FAST=true;
	String NAME="marcelo";
	
	//by default compiler will add public abstract
	void drive();

}
class Cars{
	public void stop() {
		System.out.println("Car stops by pressing breaks");
	}
}
class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		System.out.println("Toyota can drive");
	}
	
}