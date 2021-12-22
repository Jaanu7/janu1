import java.io.*;
import java.util.*;
public class Pattern2  
{  
  public static void main(String[] args)   
  {  
  int rows=5;  
  for (int i = rows; i>=0; i--)   
  {   
      for (int j=1; j<= i; j++)   
      {  
      System.out.print(j +" ");  
      }  
      System.out.println();  
   }  
   }
}

OUTPUT:

C:\526>javac Pattern2.java

C:\526>java Pattern2
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1