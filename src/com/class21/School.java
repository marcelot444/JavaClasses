package com.class21;

public class School {

	public static void main(String[] args) {
		Student.school="Morning School";
		Student student0 = new Student();
		student0.displayInfo();
		
		 Student student1 = new Student();
	        //assigning instance variables
	        student1.studentName = "Eric";
	        student1.GPA = 3.95;
	        student1.school = "Syntax";
	        
	        Student student2 = new Student();
	        student2.studentName = "Jaime";
	        student2.GPA = 3.90;
	        Student.school = "Syntax Tehcnologies";
	        
	        student1.displayInfo();
	        student2.displayInfo();
	        
	        int hour1 = 3, hour2;
	        hour1 = 4;
	        student1.study(hour1);
	        student0.displayInfo();
	        
	    }
	}

