package com.class10;

public class HomeworkPt2 {
	
	public static void main(String[] args) {
		
	    int [] number= {45,78,12,67,55,89,23,77,88};
        for(int i=1; i<number.length; i+=3) {
        int number1=number[i];
        System.out.print(number[i]/i +" ");
        }
	}
}