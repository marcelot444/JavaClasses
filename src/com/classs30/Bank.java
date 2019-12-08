package com.classs30;

public interface Bank {// Abstract methods 
	void haveChecking();

	void haveSavings();
}

interface Trustable {
	void trust();
}

class Finance {
	public void financing() {
		System.out.println("financial transactions must happen");
	}
}

class BOA extends Finance implements Bank, Trustable {// to check multiple interfaces

	@Override
	public void haveChecking() {
		System.out.println("BOA has checkings account");
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a savings account");
	}

	@Override
	public void trust() {
		System.out.println("You can trust BOA with your money");
	}

}

class CapitalOne extends Finance implements Bank, Trustable {

	@Override
	public void haveChecking() {
		System.out.println("Capital one has checkings account");
	}

	@Override
	public void haveSavings() {
		System.out.println("Capital One has Savings acoount");
	}

	@Override
	public void trust() {
		System.out.println("You can trust Capital One with your money");
	}

}
class CapitalOneChild extends CapitalOne{
	
}