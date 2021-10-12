import java.util.Scanner;
class Box
{
    int len, brth, hght, vol;
    static int totalVolume;
    void get ()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("................................");
        System.out.print("ENTER THE LENGTH OF THE BOX:  ");
        len = in.nextInt();
        System.out.print("ENTER THE BREADTH OF THE BOX: ");
        brth = in.nextInt();
        System.out.print("ENTER THE HEIGHT OF THE BOX:  ");
        hght = in.nextInt();
    }
    void calVolume()
    {
        vol = len * brth * hght;
        totalVolume = totalVolume + vol;
    }
}
class Q1
{
    public static void main(String args[])
    {
        Box box[] = new Box[20];
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BOXES ");
        n = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            box[i] = new Box();
            box[i].get();
            box[i].calVolume();
        }
        System.out.println("................................");
        System.out.print("TOTAL VOLUME OF BOXES: " + Box.totalVolume);
    }
}