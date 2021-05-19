import java.util.Scanner;
class Employee 
{
	int eNo,eSalary;
	String eName;
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Employee[] em=new Employee[3];
		System.out.println("ENTER THE NO. OF EMPLOYEES:");
		int n=in.nextInt();
		System.out.println("ENTER THE EMPLOYEE DETAILS");
		System.out.println("**************************");
		for(int i=0;i<n;i++)
		{
			em[i]=new Employee();
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
/*
OUTPUT
==================================================================================
ENTER THE NO. OF EMPLOYEES:
3
ENTER THE EMPLOYEE DETAILS
**************************
ENTER THE EMPLOYEE NUMBER:
1
ENTER THE EMPLOYEE NAME:
JAISON
ENTER THE EMPLOYEE SALARY:
2000
ENTER THE EMPLOYEE NUMBER:
2
ENTER THE EMPLOYEE NAME:
AKASH
ENTER THE EMPLOYEE SALARY:
50000
ENTER THE EMPLOYEE NUMBER:
3
ENTER THE EMPLOYEE NAME:
KRISHNAN
ENTER THE EMPLOYEE SALARY:
2000
ENTER THE EMPLOYEE NUMBER TO BE SEARCHED:
2
EMPLOYEE FOUND
==================================================================================
*/