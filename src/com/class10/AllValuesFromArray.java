package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {

		String[] animals= {"Cats","Dog","Cow","Snake","Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+ " ");
		}
		// Create an array to store 5 double values, print all in 1 line
		
		double[] num= {1.1,2.1,3.1,4.1};
		
		int sise=num.length;
		
		for(int a=0; a<sise; a++) {
			System.out.print(num[a]+",");
		}
		System.out.println("-------------");
		
		//Create an array of countries. 
		//While retrieving all values from an array 
		//print capital for each country.

		
		String[] country= {"Bolivia","USA","China","Russia","Peru","Brazil"};
		int zise=country.length;
		
		for(int c=0; c<zise;c++) {
			if(country[c].equals("Bolivia")) {
				System.out.println("The Capital of Bolivia is La Paz");
			}else if(country[c].equals("USA")) {
				System.out.println("The Capital of USA is D.C");
			}else if(country[c].equals("China")) {
				System.out.println("The Capital of China is Beijing");
			}else if(country[c].equals("Russia")) {
				System.out.println("The Capital of Russia is Moscow");
			}else if(country[c].equals("Peru")) {
				System.out.println("The Capital of Peru is Lima");
			}else if(country[c].contentEquals("Brazil")) {
				System.out.println("The Capital of Brazil is Rio");
			}else {
				System.out.println("Unknown");
			}
		}
		
		
		
		
		
		
		
	}
}
