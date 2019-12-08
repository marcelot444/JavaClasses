package com.class24;

public class Task {
	private Task() {
		System.out.println("No parameters");
	}
	public Task(String aa) {
		System.out.println("public string");
	}
	Task(int num){
		System.out.println("This is default constructor");
	}
	protected Task(int num1, int num2){
		System.out.println("This is a protected constructor");
	}
	public static void main(String[] args) {
		Task obj=new Task();
		Task obj1= new Task("a");
		Task obj2=new Task(1);
		Task obj3=new Task(2,3);
	}

}
