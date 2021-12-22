import java.io.*;
import java.util.*;
public class Pattern003 
  {
  public static void main(String args[])
  {
  int n=5;
  for(int i=1;i<=n;i++)
  {
  for(int j=1;j<=i;j++)
  { 
  System.out.print("* ");
  }
  System.out.println();
  }
 }  
}


OUTPUT:


C:\526>javac Pattern003.java

C:\526>java Pattern003
*
* *
* * *
* * * *
* * * * *