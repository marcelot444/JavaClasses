package com.class21;

public class Employee {
	int eId =5;
	int salary =100;
	static String CEO = "Sumair";
	
	void printInfo() {
		System.out.println("Employee Id "+ eId+" , salary is is: "+salary+"CEO is: "+CEO);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.printInfo();
		
		Employee emp2 = new Employee();
		emp2.printInfo();
	}
}
