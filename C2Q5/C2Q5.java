import java.util.Scanner;
class Student
{
	Scanner in = new Scanner(System.in);
	int rollNo,totalSubjetMark;
	String studentName, deptName;
	Student()
	{
		System.out.println("ENTER THE ROLL No.: ");
		rollNo = in.nextInt();
		System.out.println("ENTER THE STUDENT NAME: ");
		studentName = in.next();
		System.out.println("ENTER THE DEPARTMENT NAME: ");
		deptName = in.next();
	}
	void getMarks()
	{
		System.out.println("ENTER THE TOTAL MARK FOR ALL SUUBJECTS: ");
		totalSubjetMark = in.nextInt();
	}
}
interface Sports   
{
	final int sportsMark = 20;
}
class Result extends Student implements Sports
{
	int totalMark;
	void calculateTotalMark()
	{
		totalMark = totalSubjetMark + sportsMark;
	}
	void displayResult()
	{
		System.out.println("........RESULT........");
		System.out.println("ROLL NUMBER    :" + rollNo);
		System.out.println("NAME           :" + studentName);
		System.out.println("DEPARTMENT NAME:" + deptName);
		System.out.println("SUBJECT MARKS  :" + totalSubjetMark);
		System.out.println("SPORTS MARKS   :" + sportsMark);
		System.out.println("TOTAL MARKS    :" + totalMark);
	}
}
class C2Q5
{
	public static void main(String args[])
	{
		Result rslt = new Result();
		rslt.getMarks();
		rslt.calculateTotalMark();
		rslt.displayResult();
	}
}
