import java.util.Scanner;
class Employees 
{
    Scanner in = new Scanner(System.in);
    int empid,salary;
    String EName,address;;
    Employees()
    {
        System.out.println("ENTER THE EMPLOYEE ID:");
        empid = in.nextInt();
        System.out.println("ENTER THE EMPLOYEE NAME:");
        EName = in.next();
        System.out.println("ENTER THE SALLARY:");
        salary = in.nextInt();
        System.out.println("ENTER THE ADDRESS:");
        address = in.next();
    }
}

class Teacher extends Employees{
    Scanner in = new Scanner(System.in);
    String dept,sub;
    Teacher()
    {
        System.out.println("ENTER THE DEPARTMENT NAEM:");
        dept = in.next();
        System.out.println("ENTER THE SUBJECT NAME:");
        sub = in.next();
    }
    void display()
    {
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("================");
        System.out.println("EMP ID: " + empid);
        System.out.println("NAME: " + EName);
        System.out.println("ADDRESS: " + address);
        System.out.println("DEPARTMENT: " + dept);
        System.out.println("SUBJECT: " + sub);
        System.out.println("SALLARY: " + salary);
        System.out.println("================");
    }
}

public class C2Q2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NO. OF EMPLOYEES:");
        int n = in.nextInt();
        Teacher ob[] =new Teacher[n];
        for (int i=0;i<n;i++)
        {
            ob[i] = new Teacher();
            ob[i].display();
        }
    }
}