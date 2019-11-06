package com.class9;

public class Clock {

	public static void main(String[] args) {

		for (int h=0; h<12; h++) {
			
			for(int m=00;m<60;m++) {
				if (m<10) {
					System.out.println(h+ ":0"+m);
				}else
				System.out.println(h+ ":" +m);
			}
			
			
		}
		
		
		
	}

}
