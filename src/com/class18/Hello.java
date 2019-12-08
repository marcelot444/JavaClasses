package com.class18;

public class Hello {
//                Methods with Parameters
	void sayHello(String name) {

		System.out.println("Hello " + name);

	}

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("weqas");

		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("russia");
		obj.sayHelloDifferentLanguage("PARAGUAY");
		obj.sayNameAndAge("John", 25);
		obj.sayNameAndAge("Olga", 32);
		obj.isSnowing(true);
		obj.isSnowing(false);

	}

	/*
	 * Create a method that will say hello in different language on the value that
	 * will be passed when user calls a method
	 */ // Parameters
	void sayHelloDifferentLanguage(String country) {

		switch (country.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "paraguay":
			System.out.println("Hola");
			break;
		case "albania":
			System.out.println("Pershen");
			break;
		default:
			System.out.println("Invalid");
		}

	}

//                     Parameter
	void sayNameAndAge(String name, int age) {

		System.out.println("My name is " + name + " and I am " + age + " years old");
	}

	// Create a method that will check if it snowing
	// if snow-->stay at home, otherwise go for a walk
	void isSnowing(boolean isSnowing) {// method header
 		if (isSnowing) {
			System.out.println("Stay at home");
		} else {
			System.out.println("Go for a walk");
		}
	}
}
