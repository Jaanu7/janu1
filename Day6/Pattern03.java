import java.io.*;
import java.util.*;
class Pattern03
{
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int rows=sc.nextInt();
     for(int i=1;i<=rows;i++)
         {
         for(int j=1;j<=i;j++)
         {
         if(j==1 ||  j==i || i==rows)
         System.out.print(" "+j);
         else 
         System.out.print(" "); 
         }
         System.out.println();
         }
    }
}  


OUTPUT:


C:\526>javac Pattern03.java

C:\526>java Pattern03
5
 1
 1 2
 1  3
 1   4
 1 2 3 4 5