package com.class12;

public class FindDuplicatesInArray {

	public static void main(String[] args) {


        int[] array = {2,5,6,7,8,2,9};
        
        for (int i=0; i<array.length; i++) {
            for (int j=i+1;j<array.length;j++) {
                if(array[i]==array[j]) {
                    System.out.println("The duplicate in this array is "+array[j]);
                }
            }
        }
	}
}
		
		
		