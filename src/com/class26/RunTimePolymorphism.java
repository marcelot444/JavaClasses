package com.class26;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		//creating of parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("=================================");
		//creating an object of child class
		Cat cat=new Cat();
		cat.eat();//parent
		cat.meow();//from child
		cat.sleep();//from child
		System.out.println("===========================================");
		Animal obj=new Cat();
		obj.eat();
		obj.sleep();
		System.out.println();
		
		
		//widening
		double d=90;
		//narrow
		int i=(int)1.99;
		//no primitive TypeCasting
		//wideing creating an object of the child class
		//and giving refrence to the parent class
		//narrowing
		//Cat obj2 =new Animal();--> cannot convert from animal to cat

	}

}
