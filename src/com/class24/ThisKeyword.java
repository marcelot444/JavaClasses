package com.class24;

public class ThisKeyword {
	int a, b;// instance variables

	public ThisKeyword(int a, int b) {
		this.a = a;//5
		this.b = b;//10

	}
	public ThisKeyword() {
		System.out.println("I am non argumetn constructor");
	}
	public void sum(int a, int b) {
		System.out.println("The sum if local parameters is "+(a+b));
		System.out.println("The sum of instance variables is "+(this.a+this.b));
	}
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA();
		sayB();// compiler adds This automatically--> this.sayB();
	}
	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(5,10);
		obj.sum(10, 20);//This one goes in the parameters inside the method
		obj.sayA();
		obj.sayB();
		obj.sayAandB();
		
		ThisKeyword obj1=new ThisKeyword(10,20);
		obj1.sum(100, 200);
	}

}
