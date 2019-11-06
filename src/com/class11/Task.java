package com.class11;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] car = { "Chevy", "Tesla", "Nissan", "Toyota", "Honda", "Audi" };
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i] + " ");
		}
		System.out.println();
		String[] cars = { "Chevy", "Tesla", "Nissan", "Toyota", "Honda", "Audi" };
		for (String ar : cars) {
			System.out.print(ar + " ");
		}
		System.out.println();
		System.out.println("***************************************");

		int[] num = { 1, 2, 3, 4, 5 };
		
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		System.out.println("*****************************************");
		

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
