import java.io.*;
import java.util.*;
public class Pattern18 
  {
    public static void main(String args[])
    {
    int alphabet=65;
    int rows=5;
    for(int i=rows;i>=1;i--)
    {
    for(int j=1;j<=i;j++)
    {
    System.out.print((char)(alphabet+j-1)+" ");
    }
    System.out.println( );
    }
    }
    
}


output:
 C:\526>javac Pattern18.java

C:\526>java Pattern18
A B C D E
A B C D
A B C
A B
A