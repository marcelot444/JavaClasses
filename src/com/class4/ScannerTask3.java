package com.class4;

import java.util.Scanner;

public class ScannerTask3 {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();
		
		System.out.println("Please enter your city");
		String cityName= scan.nextLine();
		
		int convertedTemp=(temp-32)*5/9
		
		System.out.println("The temperture in city " +cityName+ " is " + convertedTemp);
}
}
