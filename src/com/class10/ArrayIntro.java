package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		int a;
		a=10;
		
		int a1=10;
		//1 way
		int[] b;//declare an array--> preferred way 
		int c[];
		
		b=new int[4];
		//2 ways --> all in 1 line(declaration & initialization)
		int[] array=new int[4];
		array [0]=10;
		array [1]=20;
		array [2]=30;
		array [3]=40;
		System.out.println(array[2]);
		
		//lets create an array that will store classes
		
		String[] classes=new String[4];
		classes[0]="java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="git";
		//Today we have java class
		
		System.out.println("Today we have "+classes[0]+" class");
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		// how can i change 1 to 100
		nums[0]=100;
		
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		
		
		
		String[] name=new String[3];
		name[0]="Diana";
		name[1]="Seda";
		name[2]="Jaime";
		//name[3]="Olga"; during run time we will get an exception
		//  java.lang.ArrayIndexOutOfBoundsException
		
		//System.out.println(name[3]);

		// we are putting less elements inside
		//--> compiler will give default values
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		
		System.out.println(numbers[0]);
		
		
	}

}
