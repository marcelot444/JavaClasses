package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {

		//int[] nums=new int[2147483647];
		
		int[] nums=new int [4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		
		// to find # of elements
		System.out.println(nums.length);
		
		
		
							//0     1        2            3
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		
		System.out.println("I was born in "+array[2]);
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		System.out.println("-------------------------------------");
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		char[] note= {'A','B','C','D','E','F'};
		
		System.out.println("My grade is a " +note[0]);
		
		System.out.println("-----------------------------------");
		
		String[] name= {"Marcelo","Jai","Harman","Uddhab","Raj","Dennis"};
		System.out.println(name[0]);
		
		String[] names=new String[6];
		names[0]="Marcelo";
		names[1]="Jai";
		names[2]="Harman";
		names[3]="Uddhab";
		names[4]="Raj";
		names[5]="Dennis";
		
		System.out.println(names[0]);
		
		System.out.println("---------------------------------------");
		
		String[] work= {"Java","Saturday","Day","Coding","is"};
		System.out.println(work[1]+" "+work[4]+" "+work[0]+" "+work[3]+" "+work[2]);
		
		
		
		
		
		
		
		
		
		
	}

}
