import java.io.*;
import java.util.*;
public class Pattern13
{
    public static void main(String args[])
    {
    int n=5;
    for(int i=1,p=65;i<=n;i++,p++)
    {
    for(int j=i;j<=n;j++)
    {
    System.out.print(" ");
    }
    for(int k=1;k<=i;k++)
    {
    System.out.print((char)(p)+" ");
    }
    System.out.println( );
    }
 }
}

output:

C:\526>javac Pattern13.java

C:\526>java Pattern13
     A
    B B
   C C C
  D D D D
 E E E E E