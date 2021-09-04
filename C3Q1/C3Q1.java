import java.util.Scanner;
abstract class Shape
{
	public double length, breath;
	abstract void printArea(); 
}
class Rectangle extends Shape
{
	Rectangle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE LENGTH AND BREATH OF THE RECTANGLE: ");
		length = in.nextDouble();
		breath = in.nextDouble();
	}
	void printArea()
	{
		double rectangleArea;
		rectangleArea = length * breath;
		System.out.println("AREA OF THE REACTANGLE : " + rectangleArea);
	}
}
class Triangle extends Shape 
{
 	Triangle()
 	{
 		Scanner in = new Scanner(System.in);
 		System.out.println("ENTER THE HEIGHT AND BASE OF THE TRIANGLE: ");
 		length = in.nextDouble(); //height of the triangle
 		breath = in.nextDouble(); //base of the triangle
 	}	
 	void printArea()
 	{
 		double triangleArea;
 		triangleArea = (length * breath)/2;
  		System.out.println("AREA OF THE TRIANGLE: " + triangleArea);
  	}
}
class Circle extends Shape
{
	Circle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF THE CIRCLE: ");
		length = in.nextDouble(); //radius of the circle;
	}
	void printArea()
	{
		double circleArea;
		circleArea = 3.14 * (length * length);
		System.out.println("AREA OF THE CIRCLE: " + circleArea);
	}
}
class C3Q1
{
	public static void main(String args[])
	{
		Shape rect = new Rectangle();
		Shape tri = new Triangle();
		Shape crcl = new Circle();
		rect.printArea();
		tri.printArea();
		crcl.printArea();
	}
}