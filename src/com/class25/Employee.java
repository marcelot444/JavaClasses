package com.class25;

public class Employee {
	
	int salary;
	public static String companyName;// only in package
	protected int employeeId;//only in package
	private String employeeSsn;
	
	void work() {
		System.out.println("i work at the company "+companyName);
	}
	void getPaid() {
		System.out.println("I get paid "+salary);
	}

}
