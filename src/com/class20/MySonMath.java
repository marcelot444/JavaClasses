package com.class20;

public class MySonMath {
	String name;
	
	public void add1() {// can be seen anywhere
		int num1 = 2;
		int num2 = 1;
		int result = num1 + num2;
	}
	void add2(int num1, int num2) {//With parameters
		int result = num1 + num2;// default can only be seen in package
	}
	protected int add3() {// can only be seen in packages
		int num1=4;
		int num2=2;
		int result= num1+num2;
		return result;
		
		
	}
	public int add4(int num1, int num2) {// can only be seen in class
		int number1=4;
		int number2=2;
		int result =num1+num2;
		return result;
	}

}
