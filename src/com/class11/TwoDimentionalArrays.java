package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		int[][] num = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	//should be 8
		
		// int maxValue = numbers[0][0];
	    //    for (int j = 0; j < numbers.length; j++) {
	    //        for (int i = 0; i < numbers[j].length; i++) {
	    //            if (numbers[j][i] > maxValue) {
	    //                maxValue = numbers[j][i];
	    //            }
	    //        }
	    //    }
	    //    System.out.println(maxValue);
		
		int max = num[0][0];
		for (int i=0; i< num.length; i++) {
			for (int j=0; j<num[i].length;j++) {
				if (num[i][j]> max) {
					max=num[i][j];
				}
			}
		}
		
		System.out.println(max);
		
		
		
		
		}
	}
