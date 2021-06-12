import java.util.Scanner;
class Complex
{
	int real_1,real_2,imag_1,imag_2,tempReal,tempImag;
	void readComplex()
	{
		Scanner in = new Scanner(System.in);
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
class C1Q3
{
	public static void main(String args[])
	{
		Complex ob = new Complex();
		ob.readComplex();
		ob.addComplex();
	}
}