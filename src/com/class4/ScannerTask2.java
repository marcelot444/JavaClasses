package com.class4;

import java.util.Scanner;

public class ScannerTask2 {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("What is your age");
		int num1 = keyboard.nextInt(); 
		
		if (num1>18) {
		System.out.println("You will be issued a drivers licence");
		
		}else {
			System.out.println("You can get a learners permit");
		}
	}
}