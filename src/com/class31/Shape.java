package com.class31;

public interface Shape {

	double calculateArea(double w, double l);

	void calculatePermiter(double w, double l);

}

class Circle implements Shape {

	@Override
	public double calculateArea(double w, double l) {
		return w*l;
	}

	@Override
	public void calculatePermiter(double w, double l) {
		// TODO Auto-generated method stub

	}

}

class Square implements Shape {

	@Override
	public double calculateArea(double w, double l) {
		return w*l;
	}

	@Override
	public void calculatePermiter(double w, double l) {
		// TODO Auto-generated method stub

	}

}
