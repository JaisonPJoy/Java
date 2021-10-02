import java.io.*;

class C4Q7
{
    public static void main(String arg[]) throws Exception
    {
        char txt;
        int wordCount = 0, lineCount = 1, characterCount;
        File c4q7 = new File("C4Q7.txt");
        FileInputStream fis = new FileInputStream(c4q7);
        characterCount = fis.available();
        for(int i = 0; i<characterCount; i++)
        {
            txt = (char)fis.read();
            if(txt == '\n')
                lineCount++;
            else if(txt == ' ')
                wordCount++;
        }
        System.out.println("NUMBER OF WORDS      : " + (wordCount + lineCount));
        System.out.println("NUMBER OF CHARACTERS : " + characterCount);
        System.out.println("NUMBER OF LINES      : " + lineCount);
    }
}