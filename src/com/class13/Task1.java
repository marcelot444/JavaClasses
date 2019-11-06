package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your class day:: ");
		String day = scanner.nextLine();
		
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your java class");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.equals("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.equals("Thursday")) {
			System.out.println("Thursday is your maunual testing class");
		}else {
			System.err.println("Envalid entry");
		}
		scanner.close();
		

	}

}
