package com.class9;

public class Pattern {

	public static void main(String[] args) {

		for (int k=1; k<=5; k++) {
			for (int l=5;l>=1; l--) {
				System.out.print(l);
			}
			System.out.println();
			
		}
		System.out.println("-----------");
		
		for (int a=5; a>=1; a--) {
			for(int b=1;b<=5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		for (int c=1; c<=5; c++) {// rows
			for (int d=1; d<=c;d++) {// columns 
				System.out.print(d);
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		for (int e=1; e<=5; e++) {// rows
			for (int f=1; f<=e;f++) {// columns 
				System.out.print(e);
			}
			System.out.println();
		
		
		
	}

}
}
