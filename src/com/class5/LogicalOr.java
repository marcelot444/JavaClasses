package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		//7 days a week
		// if day is 2 or 4 -->SDLC
		// if day 6 or 7 --> Java class
		//if day 1 or 5 --> no class
		// if day 3 --> Review class
		//
		
		int day = 7;
		
		if (day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		}else if (day==1 || day==3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}

		//7 days a week
				// if day is Tuesday or Thursday -->SDLC
				// if day Saturday or Sunday --> Java class
				//if day Monday or Friday --> no class
				// if day Wednesday --> Review class
				//
		
		String weekDay="Sunday";
		
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}
		
		
		
		
	}

}
