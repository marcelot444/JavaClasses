package com.class29;
//abstract classes 
public abstract class Phone {// abstract class can have both impleneted and non-implemented methods
	// implemented methods
	public void makeCall() {
		System.out.println("Make call");
	}

	public void sendText() {
		System.out.println("Send text");
	}

	// non implemented methods
	public abstract void takePictures();

	public abstract void playGames();

}
//concrete classes
class Iphone extends Phone{

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
		
	}
	
}
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("samsung takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("play games on Samsung");
	}
	
}
