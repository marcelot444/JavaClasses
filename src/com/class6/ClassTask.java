package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {

		/*ask user to enter the month they were born
		 * based on the month define the season
		 * if user is born in jan,feb,dec --->Winter
		 * if mar,apr,may-->Spring
		 * if jun,jul,aug -->Summer
		 * if sep,oct,nov-->Fall
		 * otherwise-->unknown
		 * at the end of the program
		 * "You were born in _____"
		 */
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the month you were born in");
		String month = input.nextLine();
		String Season;
		
		if (month.equals("Jan") || month.equals("Feb") || month.equals("Dec")) {
			Season = "Winter";
		}else if (month.equals("Mar") || month.equals("Apr") || month.equals("May")) {
			Season = "Spring";
		}else if (month.equals("Jun") || month.equals("Jul") || month.equals("Aug")) {
			Season = "Summer";
		}else if (month.equals("Sep") || month.equals("Oct") || month.equals("Nov")) {
			Season = "Fall";
		}else {
			Season = "Unknown";
		}
		System.out.println("You were born in " + Season);
		
		
		
		
	}

}
