package com.class21;

public class Student {

	public String studentName;
	double GPA;
	public static String school;

	public void displayInfo() {
		System.out.println(studentName + " attending " + school + " has a " + GPA);
	}

	protected void study(int hours) {
		int localVariable = 4;// inside a block of code
		System.out.println(studentName + " is Studying for " + hours + " hours.");
	}
}
