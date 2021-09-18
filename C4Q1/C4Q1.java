import java.util.Scanner;
import java.lang.*;
class MultithredingThread extends Thread
{
    public void run()
    {
        try{
            for(int i=0; i<=5; i++)
            {
                System.out.println(" THREAD EXTENDING THREAD CLASS " + i);
            }
        }
        catch (Exception e)
        {

        }
    }
}
class MultithredingRunnable implements Runnable
{
    public void run()
    {
        try{
            for(int i =0; i<=5; i++)
            {
                System.out.println(" THREAD IMPLEMENTING RUNNABLE INTERFACE " + i);
            }
        }
        catch (Exception e)
        {

        }
    }
}
class C4Q1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int sh;
        MultithredingThread mt = new MultithredingThread();
        Thread trd = new Thread(new MultithredingRunnable());
        while(true) {
            System.out.println(" ");
            System.out.println(" 1. MULTITHREADING USING THREAD CLASS. \n 2. MULTITHREDING USING RUNNABLE INTERFACE \n 3. EXIT");
            sh = in.nextInt();
            switch (sh)
            {
                case 1: mt.run();
                        break;
                case 2: trd.run();
                        break;
                case 3: System.exit(0);
                        break;
                default:
                    System.out.println("INVALID OPTION");
            }
        }
    }
}