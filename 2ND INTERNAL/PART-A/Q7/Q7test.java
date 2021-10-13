import java.util.*;
class Q7test
{
    <T extends Number> void Sort(T a, T b)
    {
        if(a.doubleValue()>b.doubleValue())
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
    }
    public static void main(String args[])
    {
        Q7test q7 = new Q7test();
        q7.Sort(2,4);
    }
}