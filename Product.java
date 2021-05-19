import java.util.Scanner;
class Product
{	
	int pcode,price;
	String pname;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Product p[] = new Product[3];
		for(int i=0;i<3;i++)
		{
			p[i] = new Product();
			System.out.println("ENTER THE PRODUCT DETAILS:");
			System.out.println("PRODUCT CODE:");
			p[i].pcode = in.nextInt();
			System.out.println("PRODUCT NAME:");
			p[i].pname = in.next();
			System.out.println("PRODUCT PRICE:");
			p[i].price = in.nextInt();
		}
		if(p[0].price<p[1].price && p[0].price<p[2].price)
		{
       	    System.out.println("PRODUCT WITH MINIMUM PRICE:");
			System.out.println("PRODUCT CODE: " + p[0].pcode);
			System.out.println("PRODUCT NAME: " + p[0].pname);
			System.out.println("PRODUCT PRICE: " + p[0].price);
		}
		else if (p[1].price<p[2].price) 
		{
			System.out.println("PRODUCT WITH MINIMUM PRICE:");
			System.out.println("PRODUCT CODE: " + p[1].pcode);
			System.out.println("PRODUCT NAME: " + p[1].pname);
			System.out.println("PRODUCT PRICE: " + p[1].price);
		}
		else
		{
			System.out.println("PRODUCT WITH MINIMUM PRICE:");
			System.out.println("PRODUCT CODE: " + p[2].pcode);
			System.out.println("PRODUCT NAME: " + p[2].pname);
			System.out.println("PRODUCT PRICE: " + p[2].price);
		}
	}
}
/*
OUTPUT
==========================================================================================
ENTER THE PRODUCT DETAILS:
PRODUCT CODE:
1
PRODUCT NAME:
RAM
PRODUCT PRICE:
50000
ENTER THE PRODUCT DETAILS:
PRODUCT CODE:
2
PRODUCT NAME:
ROM
PRODUCT PRICE:
2050
ENTER THE PRODUCT DETAILS:
PRODUCT CODE:
3
PRODUCT NAME:
GCARD
PRODUCT PRICE:
5000
PRODUCT WITH MINIMUM PRICE:
PRODUCT CODE: 2
PRODUCT NAME: ROM
PRODUCT PRICE: 2050
==========================================================================================
*/