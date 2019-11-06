package com.class8;

public class ForLoop {

	public static void main(String[] args) {

		// initialize;    test condition;     increment
		for (int i=0;         i<=4;             i++) {
			System.out.println("Good Morning");
		}
		
		//print numbers from 1-10;
		for (int i=1;  i<=10; i++) {
			System.out.println(i);
		}
		
		//print numbers from 10-1
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		for (int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
		
		for (int i = 0; i==100; i++) {
			System.out.println(i);
		}
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum = sum+i;
			System.out.println(sum+ "+");
		}
		System.out.println();
		System.out.println(sum);
		
		int sumAll=0;
		
		for (int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		System.out.println("*******************************");
		
		int total=2;
		
		for(int y=1; y<=3; y++) {
			total=total*y;//2=2*1; 4=2*2; 12=4*3
		}
			System.out.println(total);
			System.out.println("********************************");
		
		int valueEven = 0;
		
		for(int b=0; b<=20; b+=2) {
			
			valueEven=valueEven+b;
			
		}
		System.out.println(valueEven);
		
		
	
		int sumOdd = 0;
		
		for(int c=1; c<=20; c+=2) {
			
			sumOdd=sumOdd + c;
		}
		System.out.println(sumOdd);
	
	}	
}
