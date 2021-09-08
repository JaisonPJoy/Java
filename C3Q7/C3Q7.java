import java.util.Scanner;
class StringSort
{
    String [] string = new String[100];
    int len;
    void getString()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STRINGS : ");
        len = in.nextInt();
        System.out.println("ENTER THE STRING : ");
        for(int i =0; i<=len; i++)
        {
            string[i] = in.nextLine();
        }
    }
    void sortString()
    {
        for(int i=0; i<=len-1; i++)
        {
            for(int j=i+1; j<=len; j++)
            {
                if (string[i].compareTo(string[j]) > 0) //comparing strings
                {
                    String temp = string[i]; // swapping
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
        }
    }
    void displayAccending()
    {
        System.out.println("");
        System.out.println("STRING IN ACCENDING ORDER");
        for(int i=0; i<=len; i++)
        {
            System.out.println(string[i]);
        }
    }
    void displayDecending()
    {
        System.out.println("");
        System.out.println("STRING IN DECENDING ORDER");
        for(int i=len; i>=0; i--)
        {
            System.out.println(string[i]);
        }
    }
}
class C3Q7
{
    public static void main(String args[])
    {
        StringSort ssrt = new StringSort();
        ssrt.getString();
        ssrt.sortString();
        ssrt.displayAccending();
        ssrt.displayDecending();
    }
}