package com.class17;

public class Dog {
	String breed, color;
	int weight, age, legs;

	void mu() {
		System.out.println("This dog is a " + breed);
	}

	void ms() {
		System.out.println("This dog has this amount of legs " + legs);
	}

	void ts() {
		System.out.println("This dogs weight is- " + weight);
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "white";
		dog.weight = 100;
		dog.age = 6;
		dog.legs = 4;

		dog.mu();
		dog.ms();
		dog.ts();

		System.out.println();

		Dog dog2 = new Dog();
		dog2.breed = "Bulldog";
		dog2.color = "Black";
		dog2.weight = 28;
		dog2.age = 4;
		dog2.legs = 3;

		dog2.mu();
		dog2.ms();
		dog2.ts();

		System.out.println();

		Dog dog3 = new Dog();
		dog3.breed = "Labrador";
		dog3.color = "Mix";
		dog3.weight = 44;
		dog3.age = 12;
		dog3.legs = 5;

		dog3.mu();
		dog3.ms();
		dog3.ts();

	}

}
