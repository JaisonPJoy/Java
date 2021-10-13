import java.util.*;
import java.io.*;
class FileHandling {
    int a, limit, evenCount = 0, oddCount = 0;
    int data[] = new int[50];

    void createFile() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE LIMIT : ");
        limit = in.nextInt();
        FileOutputStream fos = new FileOutputStream("Q13.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        for (int i = 0; i < limit; i++) {
            a = in.nextInt();
            dos.writeInt(a);
        }
    }

    void Count() throws Exception {
        FileInputStream fis = new FileInputStream("Q13.txt");
        DataInputStream dis = new DataInputStream(fis);
        for (int i = 0; i < limit; i++) {
            data[i] = dis.readInt();
            if (data[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
    }
    void displayCount() throws Exception
    {
        System.out.println("COUNT OF EVEN NUMBERS: " + evenCount);
        System.out.println("COUNT OF ODD NUMBERS:  " + oddCount);
    }
}
class Q13tst
{
    public static void main(String args[]) throws Exception {
        FileHandling fh = new FileHandling();
        fh.createFile();
        fh.Count();
        fh.displayCount();
    }
}

