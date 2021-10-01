import java.net.*;
import java.io.*;
import java.util.*;

class C4Q6Server
{
    public static void main(String args[])
    {
        try{
            System.out.println("SERVER PROGRAM");
            System.out.println("");
            System.out.println("TYPE A MESSAGE   ....to close connection type STOP.... ");
            System.out.println("");
            ServerSocket ss = new ServerSocket(1426);
            Socket s = ss.accept();
            System.out.println("CONNECTED");
            Scanner in = new Scanner(System.in);
            String str = "";
            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            while (!str.equals("STOP"))
            {
                str = in.nextLine();
                ps.println(str);
            }
            os.close();
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}