package com.class28;

public class Child extends Parent {
	String name = "James";

	public static void main(String[] args) {
		Child obj = new Child();
		obj.callName();
	}

	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	public void calingMthod() {
		this.callName();//by default this is added
		super.callName();
	}
}
