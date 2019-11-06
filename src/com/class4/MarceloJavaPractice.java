package com.class4;

import java.util.Scanner;

public class MarceloJavaPractice {
	public static void main(String[] args) {
	    
	    Scanner money = new Scanner(System.in);
	    System.out.println("Do you need a loan?");
	    boolean loan=money.nextBoolean();
	    int score;
	    String eligibility;
	    if (loan){
	      System.out.println("What is your credit score?");
	      score=money.nextInt();
	    if (score<600) {
	      eligibility = "Not eligible";
	    }else if (score>600 && score<700); {
	      eligibility = "Maybe eligibile";
	    }else if (score>701 && score<800); {
	      eligibility = "Eligible";
	    }else if (score>800) {
	      eligibility = "Definitely eligibile";
	    
	    //
	   // Scanner money = new Scanner(System.in);
	   // System.out.println("Do you need a loan?");
	    //boolean loan=money.nextBoolean();
	    //int score;
	   // String eligibility;
	    //if (loan){
	      //System.out.println("What is your credit score?");
	      //score=money.nextLine();
	    //}if (score<600) {
	      //eligibility = "Not eligible";
	    //}else if(score>600 && score<700); {
	      //eligibility = "Maybe eligibile";
	    //}else if (score>701 && score<800); {
	      //eligibility = "Eligible";
	    //}else if (score>800) {
	      //eligibility = "Definitely eligibile";
	    //}else {
	      //eligibilty = "Unknown";
	    //}System.out.println("The eligibility is " + eligibility);
	    
	    
	    
	    
	    
	    
	  }
	  
	  
	  
	    
	    
	
	    
	    
	  
	  
		
		
		
		
		
	}
	
		  
		  