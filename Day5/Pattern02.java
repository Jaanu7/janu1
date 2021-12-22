import java.io.*;
import java.util.*;
public class Pattern02
 {
 public static void main(String args[])
 {
 int n=65;
 for(int i=0;i<5;i++)
 {
 for(int j=0;j<=i;j++)
 {
 System.out.print((char)(n+j)+" ");
   }
   System.out.println();
   }
 }  
}


output:

C:\526>javac Pattern02.java

C:\526>java Pattern02
A
A B
A B C
A B C D
A B C D E