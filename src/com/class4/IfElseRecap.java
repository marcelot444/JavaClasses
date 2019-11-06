package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Class schedule
		 * if Tuesday --> sdlc
		 * if Wednesday --> java review -->sdlc
		 * if Thursday --> sdlc
		 * if Saturday --> java coding
		 * if Sunday --> My favorite coding class
		 * 
		 */
		
		int day=7;
		
		if (day==2) {
			System.out.println("SDLC Class");
		}else if (day==3) {
			System.out.println("Review Class");
		}else if (day==4) {
			System.out.println("SDLC Class");
		}else if (day==6) {
			System.out.println("Java Class");
		}else if (day==7) {
			System.out.println("Favorite Java class");
		}else {
			System.out.println("No Class");
		}
		
		
		
		
		
	}

}
