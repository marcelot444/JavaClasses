package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}
	class Monkey extends Animal {
		// cannot overide static method with instance method
		// public void whoAmI() {
		// }

	public static void whoAmI() {
			System.out.println("I am a monkey");

		}
	}

