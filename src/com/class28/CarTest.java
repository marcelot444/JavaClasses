package com.class28;

public class CarTest {
	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		Tesla tesla1 = new Tesla("Tesla", "Y", true);
		tesla1.displayInfo();
		System.out.println("-----------Creating another object-------------------------");

		Tesla tesla2 = new Tesla("Tesla", "S", false);
		tesla2.displayInfo();
	}

}
