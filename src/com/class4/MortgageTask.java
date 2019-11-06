package com.class4;

public class MortgageTask {
	public static void main(String[] args) {
		double moRate = 5.5;
		double moPrice = 200000;

		if (moRate > 4.5) {
			System.out.println("user will not buy a house");
		} else {
			System.out.println("user will consider buying house");
		}
		if (moPrice > 200000) {
			System.out.println("user will take a loan");
		} else {
			System.out.println("I will pay cash for my house");
		}
	}

}
