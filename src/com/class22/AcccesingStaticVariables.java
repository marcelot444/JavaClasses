package com.class22;

public class AcccesingStaticVariables {

	public static void main(String[] args) {
		Husky obj = new Husky();
		System.out.println(obj.name);
		obj.name="Sharik";
		System.out.println(obj.name);
		
		System.out.println(Husky.breed);
		Husky.breed="New breed";
		System.out.println(obj.breed);
		//Static is a keyword Static 
		//keyword can be used with variables
		//can be used with methods and blocks
	}

}
