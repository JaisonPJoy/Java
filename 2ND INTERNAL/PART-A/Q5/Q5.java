import java.util.*;
class EvenNumException extends Exception
{
    int n;
    EvenNumException(int evenNum)
    {
        n = evenNum;
    }
    public String toString()
    {
        return "EVEN NUMBER EXCEPTION : " + n + " IS A EVEN NUMBER";
    }
}
class Q5
{
    void checkEven(int num) throws EvenNumException
    {
        int n = num;
        if( n % 2 == 0)
            throw new EvenNumException(n);
        else
            System.out.println("NUMBER IS NOT EVEN");
    }
    public static void main(String args[])
    {
        int num;
        Scanner in = new Scanner(System.in);
        Q5 q = new Q5();
        System.out.println("ENTER A NUMBER ");
        num = in.nextInt();
        try {
            q.checkEven(num);
        }catch (EvenNumException e)
        {
            System.out.println(e);
        }
    }
}