import java.util.Scanner;
class Person
{
    Scanner in = new Scanner(System.in);
    String gender,address,name;
    int age;
    Person()
    {
        System.out.println("PERSON DETAILS:");
        System.out.println("================");
        System.out.print("NAME: ");
        name = in.next();
        System.out.print("ADDRESS: ");
        address = in.next();
        System.out.print("GENDER: ");
        gender = in.next();
        System.out.print("Age: ");
        age = in.nextInt();
        System.out.println("================");
    }
}

class Employee extends Person{
    int emplid,sallary;
    String cmpny_name,qualification;
    Scanner in = new Scanner(System.in);
    Employee()
    {
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("================");
        System.out.print("COMPANY NAME:");
        cmpny_name = in.next();
        System.out.print("EMPLOYEE ID:");
        emplid = in.nextInt();
        System.out.print("QUALIFICATION:");
        qualification = in.next();
        System.out.print("SALLARY:");
        sallary = in.nextInt();
        System.out.println("================");
    }
}
class Teacher extends Employee{
    Scanner in = new Scanner(System.in);
    String dept,sub;
    int techrID;
    Teacher(){
        System.out.println("TEACHER DETAILS");
        System.out.println("================");
        System.out.print("DEPARTMENT NAME: ");
        dept = in.next();
        System.out.print("SUBJECT NAME: ");
        sub = in.next();
        System.out.print("TEACHER ID: ");
        techrID = in.nextInt();
        System.out.println("================");
    }
    void display()
    {
        System.out.println("DETAILS");
        System.out.println("****************");
        System.out.println("NAME: " + name);
        System.out.println("GENDER: " + gender);
        System.out.println("AGE: " + age);
        System.out.println("COMPANY NAME: " + cmpny_name);
        System.out.println("EMPLOYEE ID: " + emplid);
        System.out.println("QUALIFICATION: " + qualification);
        System.out.println("TEACHER ID: " + techrID);
        System.out.println("ADDRESS: " + address);
        System.out.println("SUBJECT: " + sub);
        System.out.println("DEPARTMENT: " + dept);
        System.out.println("SALLARY: " + sallary);
        System.out.println("****************");
    }
}
public class C2Q3 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NO OF EMPLOYEES");
        int n=  in.nextInt();
        Teacher ob[] = new Teacher[n];
        for (int i=0;i<n;i++)
        {
            ob[i]=new Teacher();
            ob[i].display();
        }
    }
}