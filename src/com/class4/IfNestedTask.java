package com.class4;

public class IfNestedTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean diploma=false;
		
		double gpa=3.7;
		
		if (diploma) {
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}
			else{
				System.out.println("You should have studied harder");
		}
		}
		else {
			System.out.println("Get a degree");
			
		}
	}

}
