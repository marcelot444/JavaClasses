package com.class14;

public class interviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 5;
		x = x + y;
		y = x - 5;
		x = x - y;

		System.out.println(x + " " + y);
		System.out.println("***********************8");

		String a = "four";  
        String b = "two";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  


	}

}
