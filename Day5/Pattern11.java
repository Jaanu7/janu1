import java.io.*;
import java.util.*;
public class Pattern11 
{
   public static void main(String args[])
   {
       int n=5;
       for(int i=1;i<=n;i++)
       {
       for(int j=i;j<n;j++)
       {
       System.out.print(" ");
       }
       for(int k=1;k<=i;k++)
       {
       System.out.print("* ");
       }
       System.out.println( );
       }
   }
}


output:

C:\526>javac Pattern11.java

C:\526>java Pattern11
    *
   * *
  * * *
 * * * *
* * * * *