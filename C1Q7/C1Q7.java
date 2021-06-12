import java.util.*;
class StringManipulation
{
    String str1,str2;
    void getStrings()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        str1 = in.next();
        System.out.println("ENTER AN ANOTHER STRING (IN CAPTIAL CASE) :");
        str2 = in.next();
    }
    void comapareStrings()
    {
        if(str1.compareTo(str2)==0)
        {
            System.out.println("BOTH ARE SYMILLAR");
        }
        else
        {
            System.out.println("BOTH ARE NOT SYMILLAR!");
        }
    }
    void concatStrings()
    {
        String str3 = str1.concat(str2);
        System.out.println("THE CONCATINATED STRING IS : "+str3);
    }
    void lengthOfString()
    {
        System.out.println("LENGTH OF "+str1+" IS: "+str1.length());
        System.out.println("LENGTH OF "+str2+" IS: "+str2.length());
    }
    void caseChange()
    {
        System.out.println(str1+" TO UPPER CASE: "+str1.toUpperCase());
        System.out.println(str2+" TO LOWER CASE: "+str2.toLowerCase());
    }
}
public class C1Q7
{
    public static void main(String args[]) 
    {
        StringManipulation ob = new StringManipulation();
        ob.getStrings();
        ob.comapareStrings();
        ob.concatStrings();
        ob.lengthOfString();
        ob.caseChange(); 
    }

}
