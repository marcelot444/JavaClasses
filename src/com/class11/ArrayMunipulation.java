package com.class11;

public class ArrayMunipulation {

	public static void main(String[] args) {
		
		String[] name = {"John","Smith","Alex","Tanaz"};
	        Arrays.sort(name);
	        
	        String[] expName = {"Smith","John", "Alex", "Tanaz"};
	        Arrays.sort(expName);
	        
	        String atl = Arrays.toString(name);
	        String exp = Arrays.toString(expName);
	        
	        System.out.println(atl.equals(exp));
		
	}

}
