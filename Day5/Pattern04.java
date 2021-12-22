import java.io.*;
import java.util.*;
public class Pattern04 
{
 public static void main(String args[])
 {
 int n=5;
 for(int i=1,p=1;i<=n;i++,p++)
 {
 for(int j=1;j<=i;j++)
 {
 System.out.print(p+" ");
 }
 System.out.println();
 }
 }
}


OUTPUT:

C:\526>javac Pattern04.java

C:\526>java Pattern04
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5