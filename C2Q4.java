import java.util.Scanner;
class Publisher
{
    int pid;
    String name;
    Scanner in = new Scanner(System.in);
    Publisher()
    {
        System.out.println("ENTER THE PUBLISHER DETAILS");
        System.out.println("===========================");
        System.out.print("PUBLISHER NAME: ");
        name = in.next();
        System.out.print("PUBLISHER ID: ");
        pid = in.nextInt();
        System.out.println("===========================");

    }
}
class Book extends Publisher
{
    String bname;
    int bid;
    Scanner in = new Scanner(System.in);
    Book()
    {
        System.out.println("ENTER THE BOOK DETAILS");
        System.out.println("===========================");
        System.out.print("BOOK NAME: ");
        bname = in.next();
        System.out.print("BOOK ID: ");
        bid = in.nextInt();
        System.out.println("===========================");
    }
}
class Literature extends Book
{
    String chap;
    int chapno;
    Scanner in = new Scanner(System.in);
    Literature()
    {
        System.out.print("CHAPTER NAME: ");
        chap = in.next();
        System.out.print("CHAPTER NO.: ");
        chapno = in.nextInt();
        System.out.println("===========================");
    }
}
class Fiction extends Literature
{
    String topic;
    Scanner in = new Scanner(System.in);
    Fiction()
    {
        System.out.print("TOPIC:");
        topic = in.next();
        System.out.println("===========================");
    }
    void display()
    {
        System.out.println("DETAILS");
        System.out.println("**************************");
        System.out.println("PUBLISHER NAME: " + name);
        System.out.println("PUBLISHER ID: " + pid);
        System.out.println("BOOK NAME:" + bname);
        System.out.println("BOOK ID: " + bid);
        System.out.println("CHAPTER: " + chap);
        System.out.println("CHAPTER NO.: " + chapno);
        System.out.println("TOPIC: " + topic);  
        System.out.println("**************************");    
    }
}
public class C2Q4 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LIMIT:");
        int n = in.nextInt();
        Fiction ob[]=new Fiction[n];
        for (int i=0;i<n;i++)
        {
            ob[i]=new Fiction();
            ob[i].display();
        }
    }
}
/*====================================================================================================
OUTPUT
ENTER THE LIMIT:
3
ENTER THE PUBLISHER DETAILS
===========================
PUBLISHER NAME: EE
PUBLISHER ID: 1022
===========================
ENTER THE BOOK DETAILS
===========================
BOOK NAME: ALGORITHM
BOOK ID: 101
===========================
CHAPTER NAME: INTRODUCTION
CHAPTER NO.: 1
===========================
TOPIC:ALGORITHMS
===========================
DETAILS
**************************
PUBLISHER NAME: EE
PUBLISHER ID: 1022
BOOK NAME:ALGORITHM
BOOK ID: 101
CHAPTER: INTRODUCTION
CHAPTER NO.: 1
TOPIC: ALGORITHMS
**************************
ENTER THE PUBLISHER DETAILS
===========================
PUBLISHER NAME: SNGCE
PUBLISHER ID: 1023
===========================
ENTER THE BOOK DETAILS
===========================
BOOK NAME: PYTHON
BOOK ID: 102
===========================
CHAPTER NAME: INTRODUCTION
CHAPTER NO.: 1
===========================
TOPIC:INTRODUCTION
===========================
DETAILS
**************************
PUBLISHER NAME: SNGCE
PUBLISHER ID: 1023
BOOK NAME:PYTHON
BOOK ID: 102
CHAPTER: INTRODUCTION
CHAPTER NO.: 1
TOPIC: INTRODUCTION
**************************
ENTER THE PUBLISHER DETAILS
===========================
PUBLISHER NAME: NIRMALA
PUBLISHER ID: 1024
===========================
ENTER THE BOOK DETAILS
===========================
BOOK NAME: C++
BOOK ID: 103
===========================
CHAPTER NAME: VRIABLES
CHAPTER NO.: 2
===========================
TOPIC:VARIABLES
===========================
DETAILS
**************************
PUBLISHER NAME: NIRMALA
PUBLISHER ID: 1024
BOOK NAME:C++
BOOK ID: 103
CHAPTER: VRIABLES
CHAPTER NO.: 2
TOPIC: VARIABLES
**************************
==============================================================================================================*/