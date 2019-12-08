package com.class17;

public class Phone {
	String brand, name;
	boolean homebutton;
	int size, memory, cameralens;

	void phoneCalls() {
		System.out.println("I can do phone calls on my " + name);
	}

	void gps() {
		System.out.println("I can use gps on my " + name);
	}

	void apps() {
		System.out.println("I can run apps on my " + name);
	}

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.brand = "Apple";
		phone1.name = "Iphone";
		phone1.homebutton = false;
		phone1.size = 256;
		phone1.cameralens = 3;

		phone1.phoneCalls();
		phone1.gps();
		phone1.apps();

		System.out.println();

		Phone phone2 = new Phone();
		phone2.brand ="Android";
		phone2.name="Samsung";
		phone2.homebutton = false;
		phone2.size=64;
		phone2.cameralens=2;
		
		phone2.phoneCalls();
		phone2.gps();
		phone2.apps();

	}

}
