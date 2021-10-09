import java.util.Scanner;
import java.io.*;
class FileHandling
{
    int oddCount = 0;
    int evenCount = 0;
    void typeCount() throws Exception
    {
        File Q13 = new File("Q13.txt");
        Scanner in = new Scanner(Q13);
        while(in.hasNext())
        {
            int x = in.nextInt();
            if(x%2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
    }
    void displayCount()
    {
        System.out.println("COUNT OF EVEN NUMBERS: " + evenCount);
        System.out.println("COUNT OF ODD NUMBERS:  " + oddCount);
    }
}
class Q13
{
    public static void main(String args[]) throws Exception
    {
        FileHandling fh = new FileHandling();
        fh.typeCount();
        fh.displayCount();
    }
}