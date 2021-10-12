import java.util.Scanner;
import java.lang.*;
class MultithreadingMultiplicationTwo extends Thread
{
    public void run()
    {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 X " + i + " = " + (i * 2));
            }
        } catch (Exception e) {
        }
    }
}
class MultithreadingMultiplicationThree extends Thread
{
    public void run()
    {
        try {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("3 X " + i + " = " + (i * 3));
        }
    }
    catch (Exception e){
        }
    }
}
class Q9
{
    public static void main(String args[]) throws Exception
    {
        Thread trTwo = new Thread(new MultithreadingMultiplicationTwo());
        Thread trThree = new Thread(new MultithreadingMultiplicationThree());
        trTwo.start();
        trThree.start();
        trTwo.join();
        trThree.join();
       /* trTwo.run();
        trThree.run();*/
    }
}

