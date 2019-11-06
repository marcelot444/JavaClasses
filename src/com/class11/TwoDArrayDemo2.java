package com.class11;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {

		
		String [] [] names= {
				{"Khan", "Yousuf", "Alex", "Zynab", "jjj"},
				{ "Moe", "Ann", "Naslyhan", "Weqas" },
				{ "Diago", "Asif", "Zubair", "Shogofa" },

		};

		int lengthOfRows = names.length;
		System.out.println(lengthOfRows);

		int lengthOfCols = names[1].length;
		System.out.println(lengthOfCols);

		for (String getArray[] : names) {
			for (String getName : getArray) {
				System.out.print(getName + " ");
			}
			System.out.println();
		}

	}

}
