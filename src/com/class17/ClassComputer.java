package com.class17;

public class ClassComputer {
// defining the template Attriubutes use Variables
	String monitor, brand, name, mouse;
	boolean keyboard;
	int size, memory, screen, ram;

	// define behavior, actions Behavior is represented by Methods
	void playGames() {
		System.out.println("I can play on my " + name);
	}

	void javaCoding() {
		System.out.println("I can do java coding on my " + name);
	}

	void watchMovie() {
		System.out.println("I can watch movie on my " + name);
	}

	// any class without a main methods cannot be executed 
	////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {

		ClassComputer comp1 = new ClassComputer();// Created object 
		comp1.brand = "Apple";//assigning the values 
		comp1.name = "MacBook Pro";//assigning the values
		comp1.memory = 250;

		System.out.println("I have " + comp1.brand + " " + comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();

		System.out.println();

		ClassComputer comp2 = new ClassComputer();
		comp2.brand = "Dell";
		comp2.name = "420";
		comp2.memory = 125;

		comp2.javaCoding();
		comp2.watchMovie();
		comp2.playGames();

	}

}
