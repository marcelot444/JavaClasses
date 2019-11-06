package com.class4;

import java.util.Scanner;

public class ScannerTask {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the amount of loan needed");
		double num1 = scan.nextDouble();
		
		if (num1<200000) {
		System.out.println("You will recieve the loan");
	}else {
		System.out.println("You will be rejected");
	}

	}
}