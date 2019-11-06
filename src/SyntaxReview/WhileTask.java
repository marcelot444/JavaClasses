package SyntaxReview;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {
	
		
		int b=5;
		        while (b<=25) {
		        	
		        	System.out.print(b+" ");
		            b++;
		
		
		            System.out.println("----------------------");
		            Scanner scan=new Scanner (System.in);
		            String name;
		            System.out.println("Print your name");
		            name=scan.nextLine();
		            int c=1;
		            while (c<=3) {
		                System.out.println("Hello "+name);
		                c++;
	}  
}
}
}