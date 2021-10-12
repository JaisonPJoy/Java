import java.util.Scanner;
class Matrix
{
    int row, col;
    int matrix[][] = new int[10][10];
    int matrixSum[][] = new int[10][10];

    void getMatrix()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE NO OF ROWS FOR THE MATRIX: ");
        row = in.nextInt();
        System.out.print("ENTER THE NO OF COLUMNS FOR THE MATRIX: ");
        col = in.nextInt();
        System.out.println("ENTER YOUR MATRIX: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in.nextInt();
            }
    }
    void addMatrix(Matrix m1, Matrix m2)
    {
        if(m1.row != m2.row) {
            System.out.println("ADDITION NOT POSSIBLE !");
        }
        else {
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++){
                    matrixSum[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                }
            System.out.println("................................................");
            System.out.println("MATRIX AFTER ADDITION ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println(" " + matrixSum[i][j]);
                }
                System.out.println(" ");
            }
        }
    }
}
class Q4
{
    public static void main(String args[])
    {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        Matrix m3 = new Matrix();
        m1.getMatrix();
        m2.getMatrix();
        m3.addMatrix(m1, m2);
    }
}