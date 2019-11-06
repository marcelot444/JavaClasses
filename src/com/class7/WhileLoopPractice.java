package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		// i want to print numbers from 10 to 30 all in 1
		
		int y=10;
		while(y<=30) {
			System.out.println(y+" ");
			y++;
		}
		
		//how to print values 10 to 1;
		
		int a=10;
		
		while (a>=1) {
			System.out.println(a);
			a--;
		}
		System.out.println("---------------------");
		// print values from 50 to 20
		
		
		int f=50;
		
		while (f>=20) {
			System.out.println(f);
			f--;
		}
		System.out.println("-------------------------");
		// i want to print all even numbers from 1 to 20
		// 1 way increment value by 2 
		int z=2;
		
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		System.out.println("--------------------------------");
		//2 way using modulus 
		
		int q=2;
		
		while(q<=20) {
			System.out.println(".");
			if (q%2==0) {
				System.out.println(q);
				
			}
			q++;
		}
		System.out.println("******************************************");
		//Print only odd numbers from 50 to 100
		//Print only even numbers from 100 to 1
	
		int m=51;
		
		while(m<=100) {
			if (m%2 !=0) {
				System.out.println(m);
		}
		m++;
		
		
	}

		
		
		
		
		
		
		
		
		
	}
}
