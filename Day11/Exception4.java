import java.io.*;
import java.util.*;
public class Exception4
{
 public static void main(String args[])
{
  String str=null;
  try
  {
   System.out.println(str.charAt(0));
  }
  catch(NullPointerException e)
  {
   System.out.println(e);
  }
 }
} 


OUTPUT:

C:\526\New folder>java Exception4.java
java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local1>" is null