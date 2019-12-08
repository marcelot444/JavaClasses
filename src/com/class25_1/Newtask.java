package com.class25_1;

public class Newtask {
	private void abc() {
		System.out.println("no paramters");
	}
	private void abc(int num) {
		System.out.println("1 integer parameter");
	}
	private void abc(String str) {
		System.out.println("String parameter");
	}
	public static void main(String[] args) {
		Newtask obj=new Newtask();
		obj.abc();
		obj.abc(1);
		obj.abc("String");
	}

}
