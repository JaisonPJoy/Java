import java.util.Scanner;
class FindArea
{
	int len,bth,rad,hgt;
	double a;
	Scanner in = new Scanner(System.in);
	void area()
	{
		System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");
		len = in.nextInt();
		System.out.println("ENTER THE BREADTH OF THE RECTANGLE:");
		bth = in.nextInt();
		a = len*bth;
		System.out.println("AREA OF THE RECTANGLE: "+ a);
	}
	void area(int x)
	{
		rad = x;
		a = 3.14*rad*rad;
		System.out.println("AREA OF THE CIRCLE: "+ a);
	}
	double area (int x,int y)
	{
		rad = x;
		hgt = y;
		a = (2*3.14*rad*hgt)+(2*3.14*rad*rad);
		return(a);
	}
}
class C2Q1
{
	public static void main(String args[])
	{
		FindArea ob = new FindArea();
		int rad,hgt;
		double v;
		Scanner in = new Scanner(System.in);
		ob.area();
		System.out.println("ENTER THE RADIUS OF THE CIRCLE:");
		rad = in.nextInt();
		ob.area(rad);
		System.out.println("ENTER THE RADIUS OF THE CYLINDER:");
		rad = in.nextInt();
		System.out.println("ENTER THE HEIGHT OF THE CYLINDER:");
		hgt = in.nextInt();
		v = ob.area(rad,hgt);
		System.out.println("AREA OF THE CYLINDER: "+v);
	}
}
/*======================================================================================================================
OUTPUT
ENTER THE LENGTH OF THE RECTANGLE:
2
ENTER THE BREADTH OF THE RECTANGLE:
2
AREA OF THE RECTANGLE: 4.0
ENTER THE RADIUS OF THE CIRCLE:
5
AREA OF THE CIRCLE: 78.5
ENTER THE RADIUS OF THE CYLINDER:
5
ENTER THE HEIGHT OF THE CYLINDER:
2
AREA OF THE CYLINDER: 219.8
=======================================================================================================================*/