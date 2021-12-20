import java.io.*;
import java.util.*;
public static Program3
{
  public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      int i=0;
      int n=str.length()-1;
        String result ="YES";
      while(i<n) {
                  if(str.charAt(i)!=str.charAt(n))
                  {
                        result ="NO";
                      System.out.println(str +"Iis a Palindrome:"+result);
                      System.exit(0);
                   }
                   i++;
                   n--;
                 }
            System.out.println(str+" Is a Palindrome:"+ result);
    }
}

OUTPUT:

