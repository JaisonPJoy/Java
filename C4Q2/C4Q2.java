import java.util.Scanner;
import java.io.*;
class FileHandling
{
	void writeText() throws Exception
	{
		String text;
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE TEXT ");
		text = in.nextLine();
		FileWriter  fwt = new FileWriter("C4Q2.txt");
		for(int i=0; i<text.length(); i++)
		{
			fwt.write(text.charAt(i));
		}
		fwt.close();
	}
	void readText() throws Exception
	{
		int x;
		FileReader fr = new FileReader("C4Q2.txt");
		System.out.println("TEXT");
		System.out.println("========================================");
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x);
		}
		fr.close();
	}
}
class C4Q2 
{
	public static void main(String arg[]) throws Exception
	{
		FileHandling fh = new FileHandling();
		fh.writeText();
		fh.readText();
	}
}
