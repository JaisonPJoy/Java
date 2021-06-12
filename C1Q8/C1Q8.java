import java.util.Scanner;
class C1Q8
{
	int eNo,eSalary;
	String eName;
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		C1Q8[] em=new C1Q8[3];
		System.out.println("ENTER THE NO. OF EMPLOYEES:");
		int n=in.nextInt();
		System.out.println("ENTER THE EMPLOYEE DETAILS");
		System.out.println("**************************");
		for(int i=0;i<n;i++)
		{
			em[i]=new C1Q8();
			System.out.println("ENTER THE EMPLOYEE NUMBER:");
			em[i].eNo=in.nextInt();
			System.out.println("ENTER THE EMPLOYEE NAME:");
			em[i].eName=in.next();
			System.out.println("ENTER THE EMPLOYEE SALARY:");
			em[i].eSalary=in.nextInt();
		}
		System.out.println("ENTER THE EMPLOYEE NUMBER TO BE SEARCHED:");
		int eNos=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].eNo==eNos)
			{
				System.out.println("EMPLOYEE FOUND");
				break;
			}
			if(i==n-1)
			{
				System.out.println("EMPLOYEE NOT FOUND");
			}
		}
	}
}