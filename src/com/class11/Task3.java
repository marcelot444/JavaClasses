package com.class11;

public class Task3 {

	public static void main(String[] args) {

		int [] [] numbers= {
				{1,2,3,10},
				{4,5,6,11},
				{7,8,9,12},
				
		};
		
		int lengthOfRows = numbers.length;
		System.out.println(lengthOfRows);
		
		int lengthofCol = numbers[1].length;
		System.out.println(lengthofCol);		
				
		for(int getArray[]:numbers) {
			for (int getName: getArray) {
				System.out.print(getName+" ");
			}
			System.out.println();
		}
				
		}
		
		
		
		
		
	}


