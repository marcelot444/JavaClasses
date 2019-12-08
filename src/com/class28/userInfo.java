package com.class28;

public class userInfo extends userClass{
	String userAddress;
	userInfo(String name, int mobileNumber, String userAddress){
		super(name,mobileNumber);
		this.userAddress=userAddress;
	}
	public void printOut() {
		System.out.println(name+" "+mobileNumber+" "+userAddress);
	}
	public static void main(String[] args) {
		userInfo user= new userInfo("marcelo is a beast ass nigga",571,"annandale");
		user.printOut();
	}

}
