import java.util.Scanner;
import java.io.*;
class FileHandling
{
	void readFile() throws Exception
	{
		Scanner in = new Scanner(new File("C4Q4.txt"));
		PrintWriter evenfile = new PrintWriter(new FileWriter("C4Q4EVEN.txt"));
		PrintWriter oddfile = new PrintWriter(new FileWriter("C4Q4ODD.txt"));
		while(in.hasNextLine())
		{
			int x = in.nextInt();
			if(x%2 == 0)
			{
				//System.out.println("even");
				evenfile.write(x+"\n"+"");
			}
			else
			{
				//System.out.println("odd");
				oddfile.write(x+"\n"+"");
			}
		}
		evenfile.close();
		oddfile.close();
	}
	void displayMainFile() throws Exception
	{
		BufferedReader evenbuffer = new BufferedReader(new FileReader("C4Q4.txt"));
        	System.out.println("C4Q4.txt");
        	System.out.println("-----------------------------------------");
        	String st;
        	while ((st = evenbuffer.readLine()) != null)
        	{
           		 System.out.println(st);
        	}
        	System.out.println("");
	}
	void displayEvenFile() throws Exception
	{
		BufferedReader evenbuffer = new BufferedReader(new FileReader("C4Q4EVEN.txt"));
        	System.out.println("C4Q4EVEN.txt");
        	System.out.println("-----------------------------------------");
        	String st;
        	while ((st = evenbuffer.readLine()) != null)
        	{
            		System.out.println(st);
        	}
        	System.out.println("");
	}
	void displayOddFile() throws Exception
	{
		BufferedReader oddbuffer = new BufferedReader(new FileReader("C4Q4ODD.txt"));
        	System.out.println("C4Q4ODD.txt");
        	System.out.println("-----------------------------------------");
        	String st;
        	while ((st = oddbuffer.readLine()) != null)
        	{
           		System.out.println(st);
        	}
       		System.out.println("");
	}
}
class C4Q4test 
{
	public static void main(String args[]) throws Exception
	{
		FileHandling fh = new FileHandling();
		fh.readFile();
		fh.displayMainFile();
		fh.displayEvenFile();
		fh.displayOddFile();
	}	
}
