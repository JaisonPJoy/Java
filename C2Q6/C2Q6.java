import java.util.Scanner;
import java.lang.*;
interface Measurement 
{
	void area();
	void perimeter();
	void getMeasurement();
	void displayMeasurement();
}
class Circle implements Measurement
{
	Scanner in = new Scanner(System.in);  
	Double circleRadius, circleArea, circlePeremeter;
	public void getMeasurement()
	{
		System.out.print("ENTER THE RADIUS OF THE CIRCLE: ");
		circleRadius = in.nextDouble();
	}
	public void area()
	{
		circleArea = 3.14 * (circleRadius * circleRadius);
	}
	public void perimeter()
	{
		circlePeremeter = 2 * (3.14 * circleRadius);
	}
	public void displayMeasurement()
	{
		System.out.println("........CIRCLE MEASUREMENT........");
		System.out.println("RADIUS                  : " + circleRadius);
		System.out.println("AREA                    : " + circleArea);
		System.out.println("PERIMETER/CIRCUMFERENCE : " + circlePeremeter);
		System.out.println("..................................");
	}
}
class Rectangle implements Measurement
{
	Scanner in = new Scanner(System.in);
	Double rectangleLength, rectangleBreadth, rectangleArea, rectanglePerimeter;
	public void getMeasurement()
	{
		System.out.print("ENTER THE LENGTH OF THE RECTANGLE: ");
		rectangleLength = in.nextDouble();
		System.out.print("ENTER THE BREADTH OF THE RECTANGLE: ");
		rectangleBreadth = in.nextDouble();
	}
	public void area()
	{
		rectangleArea = rectangleBreadth * rectangleLength;
	}
	public void perimeter()
	{
		rectanglePerimeter = 2 * (rectangleBreadth + rectangleLength);
	}
	public void displayMeasurement()
	{
		System.out.println("........RECTANGLE MEASUREMENT........");
		System.out.println("LENGTH    : " + rectangleLength);
		System.out.println("BREADTH   : " + rectangleBreadth);
		System.out.println("AREA      : " + rectangleArea);
		System.out.println("PERIMETER : " + rectanglePerimeter);
		System.out.println(".....................................");
	}
}
class C2Q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice;
		Measurement crcl = new Circle();
		crcl.getMeasurement();
		crcl.area();
		crcl.perimeter();
		Measurement rect = new Rectangle();
		rect.getMeasurement();
		rect.area();
		rect.perimeter();
		while(true)
		{
			System.out.println(" 1.CIRCLE DETAILS \n 2.RECTANGLE DETAILS \n 3.EXIT");
			System.out.println("ENTER YOUR CHOICE: ");
			choice = in.nextInt();
			switch (choice) 
			{
				case 1 : crcl.displayMeasurement();
				break;
				case 2 : rect.displayMeasurement();
				break;
				case 3 : System.exit(0);
				default:
					System.out.println("!! INVALID INPUT !!");	
			}
		}
	}
}