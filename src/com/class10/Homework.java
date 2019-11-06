package com.class10;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		int startPoint;
        int endPoint;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("enter strat point value");
        startPoint=scan.nextInt();
        System.out.println("enter end point value");
        endPoint=scan.nextInt();
        
        while (endPoint<=startPoint) {
            System.out.println("End point Value must be larger then start value ");
            System.out.println("enter next end point value");
            endPoint=scan.nextInt();}
        
        int sumEven=0;
        int sumOdd=0;
        for(int i=startPoint; i<=endPoint; i++) {
            if (i%2==0) {
                 sumEven=sumEven+i;
                
            }else sumOdd=sumOdd+i;
            
            
        }
        
        System.out.println( "Sum of all Even Number "+sumEven);
        System.out.println("Sum of all Odd numbers  "+sumOdd);
        }
        
    
    
    }

