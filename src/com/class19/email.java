package com.class19;

public class email {

	public static void main(String[] args) {

		Task1 cc=new Task1();
		String email=cc.createEmail("john", "snow", "@yahoo.com");
		System.out.println(email);
	}

}
