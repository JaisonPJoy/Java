import java.util.Scanner;
class ComplexNumberAdittion
{
    int real, img;
    void getComplexNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE COMPLEX NUMBER");
        real = in.nextInt();
        img = in.nextInt();
    }
    void addComplexNumber(ComplexNumberAdittion c1, ComplexNumberAdittion c2)
    {
        real = c1.real + c2.real;
        img = c1.img + c2.img;
        System.out.println("THE RESULT IS:");
        System.out.println( real + " + " + img + "i");
    }
}
class Q6
{
    public static void main(String args[])
    {
        ComplexNumberAdittion c1 = new ComplexNumberAdittion();
        ComplexNumberAdittion c2 =new ComplexNumberAdittion();
        ComplexNumberAdittion c3 = new ComplexNumberAdittion();
        c1.getComplexNumber();
        c2.getComplexNumber();
        c3.addComplexNumber(c1,c2);
    }
}