import java.util.Scanner;

class Compare<T> // T - type specified here Integer - extend Number class
{
    T fstNumber, sndNumber ;
    Compare(T fstNumber, T sndNumber) // constructor
    {
        this.fstNumber = fstNumber;
        this.sndNumber = sndNumber;
    }
    void compareIntigers()
    {
        int a = Integer.parseInt(fstNumber.toString()); // type casting object to string and then to int
        int b = Integer.parseInt(sndNumber.toString()); // type casting object to string and then to int
        if(a == b)
        {
            System.out.println(" BOTH NUMBERS ARE EQUAL");
        }
        else if (a > b)
        {
            System.out.println("" + a + " IS GREATER THAN " + b);
        }
        else
        {
            System.out.println("" + b + " IS GREATER THAN " + a);
        }
    }
}

class Q7
{
    public static void main(String args[])
    {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS: ");
        a = in.nextInt();
        b = in.nextInt();
        Compare <Integer> T = new Compare <Integer> (a,b);
        T.compareIntigers();
    }
}