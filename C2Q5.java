import java.util.Scanner;
class Student
{
    Scanner in = new Scanner(System.in);
    int sid,mark;
    String sname;
    void getAccademic()
    {
        System.out.println("ENTER THE STUDENT ID (roll no.): ");
        sid = in.nextInt();
        System.out.println("ENTER THE NAME: ");
        sname = in.next();
        System.out.println("ENTER THE MARKS: ");
        mark = in.nextInt();
    }
}
interface Sports
{
    Scanner in = new Scanner(System.in);
    final int smarks = 30;
}

class Result extends Student implements Sports
{
    int tmark;
    tmark = smarks + mark;
    void display()
    {
        System.out.println("STUDENT DETAILS");
        System.out.println("===========================");
        System.out.println("NAME: " + sname);
        System.out.println("STUDENT ID (roll no.): " + sid);
        System.out.println("ACADEMIC MARKS: " + mark);
        System.out.println("SPORTS MARKS: " + smarks);
        System.out.println("TOTAL MARK: " + tmark);
    }
}
public class C2Q5 
{
    public static void main(String args[])
    {
        Result ob = new Result();
        ob.getAccademic();
        ob.display();
    }
}
/*==========================================================================================================
OUTPUT
ENTER THE STUDENT ID (roll no.):
101
ENTER THE NAME:
Hari
ENTER THE MARKS:
40
STUDENT DETAILS
===========================
NAME: Hari
STUDENT ID (roll no.): 101
ACADEMIC MARKS: 40
SPORTS MARKS: 30
TOTAL MARK: 70
===========================================================================================================*/