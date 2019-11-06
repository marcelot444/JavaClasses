package com.class5;

import java.util.Scanner;

public class Homework {

		
		 public static void main (String args []){
			 Scanner money=new Scanner (System.in);
			 System.out.println("Do you need a loan?");
			 boolean loan=money.nextBoolean();
			 int score;
			 String eligibility;
			 if (loan){
			  System.out.println("What is your credit score");
			  score=money.nextInt();
			  if (score<600){
			    eligibility="Not eligible";
			  }else if(score>600 && score<700){
			    eligibility="Maybe eligible";
			  }else if (score>701 && score<800){
			    eligibility="Eligible";
			  }else if (score>800){
			    eligibility="Definitely eligible";
			  }else{
			    eligibility="not eligible";
			  }
			 }else{
			  eligibility="Unknown";
			 }System.out.println("The eligibility is "+ eligibility);
			 }
			     
}    
			     
			     
			     
			     
			     
			   
			   

			 
		
		
		
	


