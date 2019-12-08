package com.classs30;

public class BankTest {
	public static void main(String[] args) {//differene between interface and abstract for the job 
		//we wont be creating
		CapitalOne obj=new CapitalOneChild();
		obj.haveChecking();
		obj.haveSavings();
		obj.trust();
		obj.financing();
		System.out.println();
		
		CapitalOne co=new CapitalOne();
		co.haveChecking();
		co.haveSavings();
		co.trust();
		co.financing();
	}

}
