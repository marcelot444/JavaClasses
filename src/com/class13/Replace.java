package com.class13;

public class Replace {

	public static void main(String[] args) {

		String str="Hello Dear Dan, how are you Dan, How you been?";
		
		System.out.println(str.replace('n', 'z'));
		System.out.println("===================");
		System.out.println(str.replace("Dan", "ben"));
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
		System.out.println(str.replaceAll(regex, replacement));
		
		
		
		
	}

}
