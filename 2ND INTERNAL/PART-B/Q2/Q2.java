import java.util.Scanner;
class CalculateDistance
{
    int feet, inches;
    void getDistance()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE DISTANCE IN FEET: ");
        feet = in.nextInt();
        System.out.print("ENTER THE DISTANCE IN INCHES: ");
        inches = in.nextInt();
    }
    void calculateDistance(CalculateDistance d1, CalculateDistance d2)
    {
        inches = d1.inches + d2.inches;
        feet = d1.feet + d2.feet + (inches) / 12;
        inches = inches % 12;
    }
    void displayDistance()
    {
        System.out.println("..........................................");
        System.out.println("TOTAL DISTANCE IS : " + feet + " FEET and " + inches + " INCHES");
    }
}
class Q2
{
    public static void main(String args[])
    {
        CalculateDistance d1 = new CalculateDistance();
        CalculateDistance d2 = new CalculateDistance();
        CalculateDistance d3 = new CalculateDistance();
        d1.getDistance();
        d2.getDistance();
        d3.calculateDistance(d1,d2);
        d3.displayDistance();
    }
}