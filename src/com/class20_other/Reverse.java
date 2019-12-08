package com.class20_other;

public class Reverse {
	
		protected String reverse(String str) {
		    String str1="";
		    for(int i=str.length()-1;i>=0; i--) {
		        str1=str1+str.charAt(i);
		    }
		    return str1;
		}
		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		Reverse obj=new Reverse();
		String result=obj.reverse("marcelo");
		System.out.println(result);
		    }

}
