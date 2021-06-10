import java.util.Scanner;
class Matrix
{
    Scanner in = new Scanner(System.in);
    int i,j,r,c;
    int a[][] = new int[100][100];
    void getRowColm() 
    {
        System.out.println("ENTER THE NO. OF ROW AND COLUMN:");
        r = in.nextInt();
        c = in.nextInt();
    }
    void getMatrix() 
    {
        System.out.println("ENTER THE MATRIX:");
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
    }
    void checkSymmetic()
    {
        int f=0;
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                if (a[i][j] == a[j][i])
                    break; 
            }
        }
        if(f==0)
            System.out.println("THE MATRIX IS SYMMETIC ");
        else
            System.out.println("THE MATRIX IS NOT SYMMETIC!");
    }
}
public class C1Q4
{
    public static void main(String args[])
    {
        Matrix ob = new Matrix();
        ob.getRowColm();
        ob.getMatrix();
        ob.checkSymmetic();
    }
}
/*=======================================================================================================================
OUTPUT
ENTER THE NO. OF ROW AND COLUMN:
3
3
ENTER THE MATRIX:
0 1 2
1 0 1
2 1 0
THE MATRIX IS SYMMETIC
========================================================================================================================*/