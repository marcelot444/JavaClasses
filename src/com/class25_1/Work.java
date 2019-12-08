package com.class25_1;

public class Work {
	static void abc() {
		System.out.println("no parameters");
	}
	static void abc(String str) {
		System.out.println("String parameter");
	}
	static void abc(int num) {
		System.out.println("int paramter");
	}
	
	public static void main(String[] args) {
		abc();
		abc("String");
		abc(1);
	}

}
