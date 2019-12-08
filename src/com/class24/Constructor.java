package com.class24;

public class Constructor {
	void Constructor() {// this is a method the moment void entered
		System.out.println("Hello");//method can have any name
	}

	Constructor() {//needs to have the same name as class
		System.out.println("I am constructor");// constructor doesnt have return type 
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor();
		obj.Constructor();
	}

}
