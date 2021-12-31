import java.io.*;
import java.util.*;
class Exception3
{
 public static void main(String args[])
 {
 try {
 int[] a=new int[10];
 a[0]=120;
 a[40]=45;
 System.out.println(a[0]);
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println(e);
 }
 }
}

OUTPUT:

C:\526\New folder>java Exception3.java
java.lang.ArrayIndexOutOfBoundsException: Index 40 out of bounds for length 10