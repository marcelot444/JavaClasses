package com.class8;

import java.util.Scanner;

public class TaskPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			
			
		}
			Scanner scan = new Scanner(System.in);
			String ask;
			for (int b =1; b<=10;b++){
				System.out.println("Would you like to apply for a credit card");
				ask = scan.nextLine();
				
				if (ask.equalsIgnoreCase("yes")) {
					break;
				}
			}
			
			
	
		
	}

	}


