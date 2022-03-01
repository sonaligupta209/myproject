package abstractandinterface;
import java.io.*;

abstract class Shape {

	
	String objectName = " ";

	
	Shape(String name) { this.objectName = name; }

	
	
	public void moveTo(int x, int y)
	{
		System.out.println(this.objectName + " "
						+ "has been moved to"
						+ " x = " + x + " and y = " + y);
	}

	
	abstract public double area();
	abstract public void draw();
}


class Rectangle extends Shape {

	
	int length, width;


	Rectangle(int length, int width, String name)
	{

		
		super(name);

		
		this.length = length;
		this.width = width;
	}

	
	 public void draw()
	{
		System.out.println("Rectangle has been drawn ");
	}

	
	 public double area()
	{
		// Length * Breadth
		return (double)(length * width);
	}
}

//Class 3
//Helper class extending Class 1
class Circle extends Shape {

	// Attributes of a Circle
	double pi = 3.14;
	int radius;

	// Constructor
	Circle(int radius, String name)
	{
		// Super keyword refers to parent class
		super(name);
		// This keyword refers to current instance itself
		this.radius = radius;
	}

	// Method 1
	// To draw circle
	@Override public void draw()
	{
		// Print statement
		System.out.println("Circle has been drawn ");
	}

	// Method 2
	// To compute circle area
	@Override public double area()
	{
		return (double)((pi * radius * radius));
	}
}

//Class 4
//Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating the Object of Rectangle class
		// and using shape class reference.
		Shape rect = new Rectangle(2, 3, "Rectangle");

		System.out.println("Area of rectangle: "
						+ rect.area());

		rect.moveTo(1, 2);

		System.out.println(" ");

		// Creating the Objects of circle class
		Shape circle = new Circle(2, "Circle");

		System.out.println("Area of circle: "
						+ circle.area());

		circle.moveTo(2, 4);
	}
}

