import java.util.Scanner;
class Publisher
{
	Scanner in = new Scanner(System.in);
	String publisherName, publisherLocation;
	Publisher()
	{
		System.out.println("ENTER THE PUBLISHER NAME: ");
		publisherName = in.next();
		System.out.println("ENTER THE PUBLISHER LOCATION: ");
		publisherLocation = in.next();
	}
}
class Book extends Publisher
{
	Scanner in = new Scanner(System.in);
	String authorName;
	Book()
	{
		System.out.println("ETER THE AUTHOR NAME: ");
		authorName = in.next();
	}
}
class Literature extends Book
{
	Scanner in = new Scanner(System.in);
	String literatureTitle;
	int literaturePrice;
	Literature()
	{
		System.out.println("ENTER THE BOOK (LITERATURE) TITLE:");
		literatureTitle = in.next();
		System.out.println("ENTER THE BOOK PRICE: ");
		literaturePrice = in.nextInt();
	}
	void displayLiterature()
	{
		System.out.println("LITERATURE DETAILS");
		System.out.println("==================");
		System.out.println("PUBLISHER NAME: " + publisherName);
		System.out.println("PUBLISHER LOCATION: " + publisherLocation);
		System.out.println("AUTHOR NAME: " + authorName);
		System.out.println("BOOK TITLE: " + literatureTitle);
		System.out.println("PRICE: " + literaturePrice);
	}
}
class Fiction extends Book
{
	Scanner in = new Scanner(System.in);
	String fictionTitle;
	int fictionPrice;
	Fiction()
	{
		System.out.println("ENTER THE BOOK (FICTION) TITLE:");
		fictionTitle = in.next();
		System.out.println("ENTER THE BOOK PRICE: ");
		fictionPrice = in.nextInt();
	}
	void displayFiction()
	{
		System.out.println("FICTION DETAILS");
		System.out.println("==================");
		System.out.println("PUBLISHER NAME: " + publisherName);
		System.out.println("PUBLISHER LOCATION: " + publisherLocation);
		System.out.println("AUTHOR NAME: " + authorName);
		System.out.println("BOOK TITLE: " + fictionTitle);
		System.out.println("PRICE: " + fictionPrice);
	}
}
public class C2Q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int input, i=1;
		Literature li = new Literature();
		Fiction fi = new Fiction();
		while(i <= 2)
		{
			System.out.println("FOR THE BOOK DETAILS (LITERATURE) PLS ENTER 1 :) ");
			System.out.println("FOR THE BOOK DETAILS (FICTIONS) PLS ENTER 0 :) ");
			input = in.nextInt();
			if(input == 1)
			{
				li.displayLiterature();
			}	
			else
			{
				fi.displayFiction();
			}
			i++;
		}
		
	}	
}