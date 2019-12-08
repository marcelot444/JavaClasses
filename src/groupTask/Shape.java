package groupTask;

//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
//Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. 
//Test your code.
public interface Shape {
	void calculateArea(double r);

	void calculatePerimiter(double r);
}

class Circle implements Shape {
//double r;
	@Override
	public void calculateArea(double r) {
		System.out.println("The area is " + (3.14 * r * r));

	}

	@Override
	public void calculatePerimiter(double r) {
		System.out.println("The area is " + (2 * 3.14 * r));

	}

}

class Square implements Shape {
//double l;
	@Override
	public void calculateArea(double r) {
		System.out.println("The area is " + (r * r));

	}

	@Override
	public void calculatePerimiter(double r) {
		System.out.println("The area is " + (4 * r));

	}
}
