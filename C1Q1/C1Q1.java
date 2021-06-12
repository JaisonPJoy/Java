import java.util.Scanner;
class C1Q1
{
	public static void main(String[] args) 
	{
		int[] a=new int[100];
		int i,n,s;
		Scanner in=new Scanner (System.in);
		System.out.println("ENTER THE LIMIT FOR THE ARRAY:");
		n=in.nextInt();
		System.out.println("ENTER THE ELEMENTS:");
		for(i=1;i<=n;i++)
		{
			a[i]=in.nextInt();			
		}
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
		s=in.nextInt();
		for(i=1;i<=n;i++)
		{
			if(s==a[i])
			{
				System.out.println("ELEMENT "+s+" FOUND AT "+i+"th POSITION");
				break;
			}
			if(i==n)
				System.out.println("ELEMENT NOT FOUND!");
		}
	}
}