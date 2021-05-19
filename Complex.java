import java.util.Scanner;
class Complex
{
	Scanner in = new Scanner(System.in);
	int real_1,real_2,imag_1,imag_2,tempReal,tempImag;
	void readComplex()
	{
		System.out.println("ENTER THE FIRST COMPLEX NUMBER:");
		real_1 = in.nextInt();
		imag_1 = in.nextInt();
		System.out.println("ENTER THE SECOND COMPLEX NUMBER:");
		real_2 = in.nextInt();
		imag_2 = in.nextInt();
	}
	void addComplex()
	{
		tempReal = real_1 + real_2;
		tempImag = imag_1 + imag_2;
		System.out.println("THE RESULT IS:");
		System.out.println(tempReal+" + "+tempImag+"i");
	}
}
class Main
{
	public static void main(String args[])
	{
		Complex ob = new Complex();
		ob.readComplex();
		ob.addComplex();
	}
}
/*
OUTPUT
==========================================================================================
ENTER THE FIRST COMPLEX NUMBER:
2
3
ENTER THE SECOND COMPLEX NUMBER:
6
5
THE RESULT IS:
8 + 8i
==========================================================================================
*/