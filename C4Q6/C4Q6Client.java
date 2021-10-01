import java.net.*;
import java.io.*;
import java.util.*;

class C4Q6Client
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("CLIENT PROGRAM");
            System.out.println("");
            System.out.println("MESSAGE FROM THE SEVER IS DISPLAYED BELOW");
            System.out.println("");
            Socket s = new Socket("127.0.0.1", 1426);
            Scanner in = new Scanner(s.getInputStream());
            String str = "";
            do {
                str = in.nextLine();
                System.out.println(str);
            }while (!str.equals("STOP"));
            in.close();
            s.close();
        }catch (Exception e){

        }
    }
}