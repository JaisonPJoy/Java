import java.util.Scanner;
class Matrix
{
    Scanner in = new Scanner(System.in);
    int i,j,r1,r2,c1,c2;
    int a[][] = new int[100][100];
    int b[][] = new int[100][100];
    void getMatrixA() 
    {
        System.out.println("ENTER THE NO. OF ROW AND COLUMN FOR THE FIRST MATRIX:");
        r1 = in.nextInt();
        c1 = in.nextInt();
        System.out.println("ENTER THE FIRST MATRIX:");
        for (i = 0; i < r1; i++)
        {
            for (j = 0; j < c1; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
    }
    void getMatrixB() 
    {
        System.out.println("ENTER THE NO. OF ROW AND COLUMN FOR THE SECOND MATRIX:");
        r2 = in.nextInt();
        c2 = in.nextInt();
        System.out.println("ENTER THE SECOND MATRIX:");
        for (i = 0; i < r2; i++) 
        {
            for (j = 0; j < c2; j++) 
            {
                b[i][j] = in.nextInt();
            }
        }
    }
    void addMatrix() 
    {
        if(r1==r2 && c1==c2) 
        {
            System.out.println("SUM:\n");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c2; j++)
                {
                    System.out.print(" "+(a[i][j] + b[i][j]));
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("ADDITION NOT POSSIBLE!!");
        }
    }
}
class C1Q4
{
    public static void main(String args[])
    {
        Matrix ob = new Matrix();
        ob.getMatrixA();
        ob.getMatrixB();
        ob.addMatrix();
    }
}