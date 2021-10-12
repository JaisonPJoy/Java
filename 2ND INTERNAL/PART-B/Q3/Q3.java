import java.util.Scanner;
class SearchElement
{
    int a [] = new int[50];
    int len;
    void getArray()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH FOR THE ARRAY: ");
        len = in.nextInt();
        System.out.println("ENTER THE ELEMENTS ");
        for(int i = 0; i < len; i++)
        {
            a[i] = in.nextInt();
        }
    }
    void search()
    {
        int num ,f = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE SEARCHED: ");
        num = in.nextInt();
        for (int i = 0; i < len; i++)
        {
            if( a[i] == num)
            {
                System.out.println("NUMBER FOUND AT POSITION " + (i + 1));
                f = 1;
            }
        }
        if( f == 0 )
        System.out.println("NUMBER NOT FOUND");
    }
}
class Q3
{
    public static void main(String args[])
    {
        SearchElement se = new SearchElement();
        se.getArray();
        se.search();
    }
}