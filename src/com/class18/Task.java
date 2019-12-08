package com.class18;

public class Task {
	void number(int a, int b) {
		if (a > b) {
			System.out.println(a + " Is larger than " + b);
		} else {
			System.out.println("invalid");
		}
	}

	void even(int c) {
		if (c % 2 == 0) {
			System.out.println(c + " is even");
		} else {
			System.out.println(c + " is not even");
		}
	}

	public static void main(String[] args) {
		Task abc = new Task();
		abc.number(5, 1);
		abc.even(7);
	}

}
