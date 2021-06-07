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
/*===================================================================================================================
OUTPUT
ENTER THE NO. OF EMPLOYEES:
3
ENTER THE EMPLOYEE ID:
101
ENTER THE EMPLOYEE NAME:
john
ENTER THE SALLARY:
25000
ENTER THE ADDRESS:
kochi
ENTER THE DEPARTMENT NAEM:
CS
ENTER THE SUBJECT NAME:
java
EMPLOYEE DETAILS
================
EMP ID: 101
NAME: john
ADDRESS: kochi
DEPARTMENT: CS
SUBJECT: java
SALLARY: 25000
================
ENTER THE EMPLOYEE ID:
102
ENTER THE EMPLOYEE NAME:
hari
ENTER THE SALLARY:
50000
ENTER THE ADDRESS:
kollam
ENTER THE DEPARTMENT NAEM:
civil
ENTER THE SUBJECT NAME:
maths
EMPLOYEE DETAILS
================
EMP ID: 102
NAME: hari
ADDRESS: kollam
DEPARTMENT: civil
SUBJECT: maths
SALLARY: 50000
================
ENTER THE EMPLOYEE ID:
103
ENTER THE EMPLOYEE NAME:
jai
ENTER THE SALLARY:
28000
ENTER THE ADDRESS:
muvattupuzha
ENTER THE DEPARTMENT NAEM:
mech
ENTER THE SUBJECT NAME:
physics
EMPLOYEE DETAILS
================
EMP ID: 103
NAME: jai
ADDRESS: muvattupuzha
DEPARTMENT: mech
SUBJECT: physics
SALLARY: 28000
================
=================================================================================================================*/