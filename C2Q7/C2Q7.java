//System.out.println(java.time.LocalDate.now());
import java.util.Scanner;
interface Bill
{
	void displayBill();
}

class PayBill implements Bill
{
	Scanner in = new Scanner(System.in);
	int productId, productQuantity, unitPrice, totalPrice; 
	static int netAmount = 0;
	String productName;
	
	PayBill()
	{
		System.out.print("PRODUCT ID   : ");
		productId = in.nextInt();
		System.out.print("PRODUCT NAME : ");
		productName = in.next();
		System.out.print("QUANTITY     : ");
		productQuantity = in.nextInt();
		System.out.print("UNIT PRICE   : ");
		unitPrice = in.nextInt();
		System.out.println(".........................");
		totalPrice = unitPrice * productQuantity; // total of a single product
		netAmount = netAmount + totalPrice; // grand total of purchase
	}

	public void displayBill()
	{
		System.out.println(productId + "				" + productName + "				" + productQuantity + "				" + unitPrice + "				" + totalPrice);
		//System.out.println("												" + netAmount);
	}
	/*public void displayNetAmount()
	{
		System.out.println("												" + netAmount);
	}*/
}

class C2Q7 extends PayBill
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int noOfItem;
		System.out.println("ENTER THE NUMBER OF ITEM PURCHASED: ");
		noOfItem = in.nextInt();
		System.out.println("\n\n");
		//PayBill pbill[] = new PayBill[noOfItem];
		Bill bill[] = new PayBill[noOfItem];

		for( int i=0; i< noOfItem; i++)
		{
			bill[i] = new PayBill();
		}
		System.out.println("\n\n\n");
		System.out.println("                                       					 BILL ");
		System.out.println("...............................................................................................................................................");
		System.out.println("ORDER No.: " + (int) (Math.random() * 101)); // 0 to 100 random numbers
		System.out.println("DATE     : " + java.time.LocalDate.now()); // system date in yyyy-mm-dd
		System.out.println("");
		System.out.println("PRODUCT ID.			NAME.				QUANTITY.			UNIT PRICE.			TOTAL.");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		
		for( int i=0; i< noOfItem; i++)
		{
			bill[i].displayBill();
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		//static void displayNetAmount()
		//{
			System.out.println("														NET AMOUNT.     " + netAmount);
			System.out.println("																===============");
		//}
		//Bill bill = new PayBill();
		//bill.displayNetAmount();
		//displayNetAmount();
	}
}