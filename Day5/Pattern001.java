import java.io.*;
import java.util.*;
public class Pattern001 
{
    public static void main(String args[])
    {
    int n=5;
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=i;j++)
    {
    System.out.print(j+" ");
    }
    System.out.println();
    }
    } 
}


OUTPUT:


C:\526>javac Pattern001.java

C:\526>java Pattern001
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5