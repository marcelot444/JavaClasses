package com.class26;

public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.money=900;
		double fee=bank.chargeFee();
		System.out.println("Bank fee= "+fee);
		
		PNC pnc=new PNC();
		pnc.money=900;
		pnc.chargeFee();
		double pncFee=pnc.chargeFee();
		System.out.println("PNC fee= "+pncFee);
		
	}

}
