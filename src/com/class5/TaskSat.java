package com.class5;

import java.util.Scanner;

public class TaskSat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		input.nextBoolean();
		boolean cc=input.nextBoolean();
		
		if (cc) {
			System.out.println("What is the balance on your card?");
			int balance = input.nextInt();
			if (balance>1000) {
				System.out.println("Please pay off your balance");
			}else {
				System.out.println("You can spend more money");
			}
			
		}else {
			System.out.println("would you like to apply for a credit card");
		}

	}

}
