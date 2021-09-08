import java.util.Scanner;
class ReverseString
{
    public void revString(String str)
    {
        String eachWord[] = str.split("\\s");
        String revWord = "";
        for (String w : eachWord) // java for each loop for getting each single word from the string
        {
            StringBuilder sb = new StringBuilder(w); // using java StringBuilder class
            sb.reverse(); // reversing the word
            revWord = revWord + sb.toString() + " "; // adding to the reversed string
        }
        System.out.println("REVERSED STRING :   " + revWord.trim()); // trim() used for eliminating leading and traling spaces
    }
}
class C3Q6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str;
        ReverseString rstr = new ReverseString();
        System.out.println("");
        System.out.println("ENTER THE STRING :  ");
        str = in.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("ORGINAL STRING :    " + str);
        rstr.revString(str);
    }
}