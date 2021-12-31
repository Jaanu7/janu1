import java.io.*;
import java.util.*;
public class Exception5 
{
  public static void main(String[] args) 
  {
    File file = new File("abcd.txt");
    FileInputStream fn = null;
    try
    {
    fn = new FileInputStream(file);
    while (fn.read()!=-1)
    {
    System.out.println(fn.read());
    }
    }
    catch (FileNotFoundException e)
    {
    e.printStackTrace();
    }
    catch(IOException e)
    {
    e.printStackTrace();
    }
  }
}

OUTPUT :
-------------------------------------------------------
java.io.FileNotFoundException: abcd.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at exception3.main(exception3.java:10)