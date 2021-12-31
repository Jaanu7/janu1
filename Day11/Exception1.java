import java.io.*;
import java.util.*;
 class Exception1
 {
    public static void main(String args[])
    {
    try 
    {
      int a=100/0;
      }
      catch (ArithmeticException e)
      {
      System.out.println(e);
      }
      System.out.println("java exception statement");
      }
  }    


OUTPUT:

C:\526\New folder>java Exception1.java
java.lang.ArithmeticException: / by zero
java exception statement