package com.class22;

public class Human {
	//Instance variables inside the class outside the method
	String name;
	String lastName;
	
	//Static variable belong to the class
	static int eyes=2;
	static int nose = 1;
	static boolean brain = true;

	// Instance variables are inside a class outside the method
	public static void main(String[] args) {
		Human human1 = new Human();
		human1.lastName = "John";
		human1.lastName = "smith";
		System.out.println(Human.eyes);
		System.out.println(human1.nose);
		System.out.println(brain);
		

		Human human2 = new Human();
		human2.name = "Jimmy";
		human2.lastName = "Miller";
		human2.lastName = "Doe";
		System.out.println(human2.lastName);
		System.out.println(human1.lastName);
	}

}
