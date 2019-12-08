package com.class29;

public class PhoneTest {
	
	public static void main(String[] args) {
		// you cannot create an object of an abstract class
		//Phone phone=new Phone(); nope don't work

		// we can create it indirectly
		Phone phone =new Iphone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();
	}
	
}
