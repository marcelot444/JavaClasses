package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*How to access static members
		 * They cane be accessed by className
		 * 
		 */
		
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getinfo1();
		
		/*how to access non static members
		 * they can be accessed by creating
		 * an object of that class
		 */
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();

	}

}
