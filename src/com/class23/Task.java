package com.class23;

public class Task {
	public String month;
	
	Task(String newMonth){
		month=newMonth;
	}
	Task(){
		System.out.println("Constructor without parameter");
	}
	public void n1() {
		System.out.println("Constructor with parameter "+month);
	}
}
