import java.io.*;
import java.util.*;
public class Pattern17
 {
 public static void main(String args[])
 {
 int n=5,p=1;
 for(int i=1;i<=n;i++)
 {
 for(int j=1;j<=i;j++)
 {
 System.out.print((p++)+" ");
 }
 System.out.println( );
 }
 }
}

output:

C:\526>javac Pattern17.java

C:\526>java Pattern17
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

