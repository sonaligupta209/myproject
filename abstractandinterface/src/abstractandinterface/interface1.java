package abstractandinterface;

//Java Program to Illustrate Concept of Interface

//Importing I/O classes
import java.io.*;

//Interface
interface Shape {

	// Abstract method
	void draw();
	double area();
}

//Class 1
//Helper class
class Rectangle implements Shape {

	int length, width;

	// constructor
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	@Override public void draw()
	{
		System.out.println("Rectangle has been drawn ");
	}

	@Override public double area()
	{
		return (double)(length * width);
	}
}

//Class 2
//Helper class
class Circle implements Shape {

	double pi = 3.14;
	int radius;

	// constructor
	Circle(int radius) { this.radius = radius; }

	@Override public void draw()
	{
		System.out.println("Circle has been drawn ");
	}

	@Override public double area()
	{

		return (double)((pi * radius * radius));
	}
}

//Class 3
//Main class
class interface1 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating the Object of Rectangle class
		// and using shape interface reference.
		Shape rect = new Rectangle(2, 3);

		System.out.println("Area of rectangle: "
						+ rect.area());

		// Creating the Objects of circle class
		Shape circle = new Circle(2);

		System.out.println("Area of circle: "
						+ circle.area());
	}
}
