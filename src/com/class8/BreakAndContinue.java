package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		//break keyword breaks/exist the loop
		for (int i=0; i<10; i++) {
			
			if (i==7) {
				break;
			}
			
			System.out.println(i);
			
		}
		System.out.println("I am outside of the loop ");
		
		// continue - it will skip CURRENT iteration
		
		for (int i =1; i<=5; i++) {
			
			if(i==3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
	
	
		for(int a=1; a<=20; a++) {
			if(a==5 || a==6|| a==7) {//5
				continue;
			}
			System.out.println(a);
			
		}
	
	
	
	
	
	
	
	
	
	}
}
