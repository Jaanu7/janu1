	import java.io.*;
import java.util.*;

    public class Prg4
    {
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int startingIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        sc.close();
 
        System.out.println(s.substring(startingIndex,endIndex));
      }
    }


OUTPUT:

programming
4 7
ram