package roman.numPackage;

import java.util.Scanner;

public class IntegerToRomanNumeralConversion{
	public static Scanner keyboard = new Scanner(System.in);
	public static int myNum;
	public static int originalNum;
	public static String answer;

	public static void IntegerToRomanNumeralProgram()  {
			do
			{
				do
				{
					
					System.out.println("Please enter an integer number, from 1 to 3999.");
					myNum = keyboard.nextInt();
					
					if (myNum < 1 || myNum > 3999)
						System.out.println(myNum + " is out of range. No Roman Numeral may exceed MMMCMXCIX (3999)");
				}while(myNum < 1 || myNum > 3999);
				 
				
				IntTORoman();
				
				do
				{
					System.out.println("Would you like to do this again?");
					answer = keyboard.next();
				}while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")));
			}while(answer.equalsIgnoreCase("yes"));
			

	}
	private static void IntTORoman() {
		String romanNum = "";
		originalNum = myNum;
	    while (myNum >= 1000) 
	    {
	    	romanNum += "M";
	        myNum -= 1000;        
	    }
	    while (myNum >= 900) 
	    {
	    	romanNum += "CM";
	        myNum -= 900;
	    }
	    while (myNum >= 500)
	    {
	        romanNum += "D";
	        myNum -= 500;
	    }
	    while (myNum >= 400) 
	    {
	    	romanNum += "CD";
	        myNum -= 400;
	    }
	    while (myNum >= 100) 
	    {
	    	romanNum += "C";
	        myNum -= 100;
	    }
	    while (myNum >= 90) 
	    {
	    	romanNum += "XC";
	        myNum -= 90;
	    }
	    while (myNum >= 50) 
	    {
	    	romanNum += "L";
	        myNum -= 50;
	    }
	    while (myNum >= 40) 
	    {
	    	romanNum += "XL";
	        myNum -= 40;
	    }
	    while (myNum >= 10) 
	    {
	    	romanNum += "X";
	        myNum -= 10;
	    }
	    while (myNum >= 9) 
	    {
	    	romanNum += "IX";
	        myNum -= 9;
	    }
	    while (myNum >= 5) 
	    {
	    	romanNum += "V";
	        myNum -= 5;
	    }
	    while (myNum >= 4) 
	    {
	    	romanNum += "IV";
	        myNum -= 4;
	    }
	    while (myNum >= 1) 
	    {
	    	romanNum += "I";
	        myNum -= 1;
	    }    
	    System.out.println( "The integer " + originalNum + " is equal to the Roman Numeral Number "+ romanNum);
	}

}
